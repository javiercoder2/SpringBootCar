package com.proyecto2.proyecto2.model;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity(name = "User")
public class User{

    //especificar lo que viene y de que tipo de libreria abajo
    //leespecificamos a la base que el siguiente atributo sera el id de la tabla
    @Id
    @GeneratedValue
    
    private int id;

    private String name;

    @Column(name="last_name")

    private String lastname;
    @Column(name="email", unique =true)
    private String correo;

//relacion one to one
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    private License license;
    
    //one to many

    @OneToMany(mappedBy="user", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    private List<BuySell> buySell;

    public User(int id, String name, String lastname, String correo) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.correo = correo;
    }
    public User() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
