/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.service;

import edu.unicundi.entity.Alumno;
import edu.unicundi.repository.IAlumnoRepo;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author ASUS-PC
 */
@Stateless
public class AlumnoService implements IAlumnoService{

    @EJB
    private IAlumnoRepo repo;
    
    @Override
    public void guardar(Alumno alumno) {
        repo.guardar(alumno);
    }

    @Override
    public void eliminar(Integer id) {
        Alumno alumno = new Alumno();
        alumno.setId(id);
        repo.eliminar(alumno);
    }
    
    
    
}
