/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.repository;

import edu.unicundi.entity.Alumno;

/**
 *
 * @author ASUS-PC
 */
public interface IAlumnoRepo {
    
    public void guardar(Alumno alumno);
    
    public void eliminar(Alumno alumno);
    
    
}
