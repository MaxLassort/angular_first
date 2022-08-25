/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maxime.resources;

import com.maxime.dao.RoleDao;
import com.maxime.model.Role;


import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author maxla
 */
@Path("role")
public class RoleResource {
    
    private RoleDao rDao = new RoleDao();
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Role> findAll(@Context HttpServletRequest req){
        List<Role> roles = rDao.findAll();
        return roles;
    }
   
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public Response create(Role role, @Context HttpServletRequest req){
        try{
            rDao.create(role);
        } catch(Exception e){
            throw new WebApplicationException(Response.status(Response.Status.BAD_REQUEST).entity("An error occured").build());
        }
        return Response.status(Response.Status.CREATED).entity("role created").build();
    }
    
    @Path("/{id}")
    @GET()
    @Produces({MediaType.APPLICATION_JSON})
    public Role getRole(@PathParam("id") long id, @Context HttpServletRequest request) {

        Role r = rDao.findById(id);

        if (r == null) {
            throw new WebApplicationException("Role was not found", Response.Status.NOT_FOUND);
        }

        return r;
    }
    
    @Path("/{id}")
    @DELETE
    public Response delete(@PathParam("id") long id) {
        try {
            rDao.delete(id);
        } catch (NotFoundException e) {
            throw new WebApplicationException(
                    Response.status(Response.Status.NOT_FOUND)
                            .entity("Role was not found.")
                            .build()
            );
        } catch (Exception e) {
            throw new WebApplicationException(
                    Response.status(Response.Status.BAD_REQUEST)
                            .entity("An error occured.")
                            .build());
        }
        return Response.status(Response.Status.OK).entity("The role is removed.").build();
    }
    
    
    @Path("{id}")
    @PUT
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response update(@PathParam("id") long id, Role r) {

        try {
            rDao.update(id, r);

        } catch (NotFoundException e) {
            throw new WebApplicationException(
                    Response.status(Response.Status.NOT_FOUND)
                            .entity("Role was not found")
                            .build()
            );
        } catch (Exception e) {
            throw new WebApplicationException(
                    Response.status(Response.Status.BAD_REQUEST)
                            .entity("An error occured")
                            .build()
            );
        }

        return Response.status(Response.Status.OK).entity("Role successfully modified").build();
    }
  
}
