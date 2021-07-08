/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.controller;

import edu.unicundi.entity.Alumno;
import edu.unicundi.service.IAlumnoService;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.validation.Valid;

/**
 *
 * @author ASUS-PC
 */
@Stateless
@Path("/alumnos")
public class AlumnoController {
    
    @EJB
    IAlumnoService service;
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)    
    @Path("/guardar")
    public Response guardar(@Valid Alumno alumno){
        service.guardar(alumno);
        return Response.status(Response.Status.CREATED).entity(alumno).build();
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/eliminar/{id}")
    public Response eliminar(@PathParam("id") Integer id){
        service.eliminar(id);
        return Response.status(Response.Status.NO_CONTENT).build();
    }
    
    
}
