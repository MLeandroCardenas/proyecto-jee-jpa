/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.service;

import edu.unicundi.entity.Alumno;
import javax.ejb.Local;

/**
 *
 * @author ASUS-PC
 */
@Local
public interface IAlumnoService {
    
    public void guardar(Alumno alumno);
    
    public void eliminar(Integer id);
    
}
