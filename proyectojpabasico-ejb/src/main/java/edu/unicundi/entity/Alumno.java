/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author ASUS-PC
 */
@Entity
@Table(name = "alumno")
public class Alumno {
        
    @Id
    private Integer id;
    
    @NotNull
    @Size(min = 3, max = 30, message = "Campo nombre es requirido")
    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;
    
    @NotNull
    @Min(value = 1, message = "Minima edad es 1")
    @Max(value = 80, message = "Maxima edad es 80")
    @Column(name = "edad", nullable = false)
    private Integer edad;
    
    public Alumno(){
    
    }

    public Alumno(Integer id, String nombre, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    
    
}
