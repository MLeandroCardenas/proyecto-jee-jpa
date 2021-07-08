/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.repository;

import edu.unicundi.entity.Alumno;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ASUS-P
 */
@Stateless
public class AlumnoRepoImp implements IAlumnoRepo{

    @PersistenceContext(unitName = "edu.unicundi_proyectojpabasico-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;
        
    @Override
    public void guardar(Alumno alumno) {
       em.persist(alumno);
    }

    @Override
    public void eliminar(Alumno alumno) {
         Alumno alu = em.find(Alumno.class, alumno.getId());        
        em.remove(alu);
    }
    
}
