package com.proyecto2.proyecto2.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name = "buySell")

public class BuySell {
    @Id
    @GeneratedValue
    private Integer id;
    @Range(min=0)
    private int monto;
    @DateTimeFormat(pattern = "yyyy-MM-dd")

    private Date fechaCompra;

    //recepcionar One to many

    @JsonManagedReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_id")
    private User user;

    //many to many de auto
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name ="CarSell",
        joinColumns = @JoinColumn(name="buySell_id"),
        inverseJoinColumns = @JoinColumn(name="car_id")
    )
    private List <CarSell> carSell;
    
    
    public BuySell(Integer id, @Range(min = 0) int monto, Date fechaCompra, User user) {
        this.id = id;
        this.monto = monto;
        this.fechaCompra = fechaCompra;
        this.user = user;
    }

    public BuySell() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

}
