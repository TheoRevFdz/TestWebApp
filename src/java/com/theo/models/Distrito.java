package com.theo.models;
// Generated 18/02/2017 10:43:58 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Distrito generated by hbm2java
 */
public class Distrito  implements java.io.Serializable {


     private int id;
     private String nombre;
     private Set personas = new HashSet(0);

    public Distrito() {
    }

	
    public Distrito(int id) {
        this.id = id;
    }
    public Distrito(int id, String nombre, Set personas) {
       this.id = id;
       this.nombre = nombre;
       this.personas = personas;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getPersonas() {
        return this.personas;
    }
    
    public void setPersonas(Set personas) {
        this.personas = personas;
    }




}


