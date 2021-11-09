package com.area.hello.world.controllers;

import com.area.hello.world.models.Persona;
import com.area.hello.world.services.PersonaService;
import com.area.hello.world.services.PersonaServiceImpl;
import com.oracle.ozark.core.Models;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.ws.rs.BeanParam;
import javax.ws.rs.POST;
import javax.ws.rs.FormParam;



@Path("/saludo")
@Controller
public class PersonaController {
        
    @Inject
    Models models;
    
    @Inject 
    PersonaService personaService;
    
    @GET
    public String hola(){
        return "/WEB-INF/jsp/saludo.jsp";
    }
    
    @POST
    @Path("/nombre")
    public String holaNombre( @FormParam("nombre") String nombre) {
        String mensaje = "Hola " + nombre;
        models.put("mensaje", mensaje);
        return "/WEB-INF/jsp/saludo-nombre.jsp";
    }
    
    @POST
    @Path("/nombre-apellidos")
    public String holaNombreApellidos(@BeanParam Persona persona) {
        String result = "/WEB-INF/jsp/saludo-nombre-apellidos.jsp";
        models.put("persona", persona);
        List<Persona> personaList=personaService.getAll();
        return result;
    }
}
