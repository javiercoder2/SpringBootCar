package com.proyecto2.proyecto2.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="CarSell")

public class CarSell {
    @Id
    @GeneratedValue
    private Integer id;
    private int cantidad;
    

        //many to many es como dos one to many
    //al ser relacion de tabla relacional no s ellama a Json
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="car_id")
    private Car car;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="buySell_id")
    private BuySell buysell;

    
    public CarSell(Integer id, int cantidad) {
        this.id = id;
        this.cantidad = cantidad;


    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }




    
}
