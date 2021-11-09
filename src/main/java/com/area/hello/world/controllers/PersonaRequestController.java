/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.hello.world.controllers;

import com.area.hello.world.models.Persona;
import com.area.hello.world.qualifiers.PersonaRequestServiceQualifier;
import com.area.hello.world.services.PersonaService;
import com.oracle.ozark.core.Models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.ws.rs.BeanParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import com.area.bonarea.dao.StudentDao;

/**
 *
 * @author jordi
 */
@Path("/peticion")
@Controller
public class PersonaRequestController {
    
     private final static String CONNECTIONSTRING
            = "jdbc:mysql://eu-cdbr-west-01.cleardb.com:3306/heroku_c2a7aa794927668?autoReconnect=true&useSSL=false";
    private final static String USER = "ba60efaf494dd2";
    private final static String PWD = "e757a8f8";
    private final static String INSERT_STATEMENT = "INSERT INTO student(firstname, "
            + "lastname, email) values(?,?,?)";
    private final static String GET_BY_ID_STATEMENT = "SELECT * from student "
            + " where id=?";
    private final static String GET_ALL_STATEMENT = "SELECT * from student";
    private final static String DELETE_STATEMENT = "DELETE FROM student"
            + " WHERE id=?";
    private final static String UPDATE_STATEMENT = "UPDATE student SET"
            + " firstname=?, lastname=?, email=? where id=?";
    private final static String DELETE_ALL_STATEMENT = "DELETE FROM student";
    
     //mysql://ba60efaf494dd2:e757a8f8@eu-cdbr-west-01.cleardb.com/heroku_c2a7aa794927668?reconnect=true
    /*static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PersonaRequestController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
        
    @Inject
    Models models;
    
    @Inject 
    @PersonaRequestServiceQualifier
    PersonaService personaService;
    
    @GET
    public String hola() {
        StudentDao s=new StudentDao();
        //s.getConnection();
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection(CONNECTIONSTRING,
                     USER, PWD);
             con.close();
             personaService.getAll();
             
         } catch (SQLException ex) {
             Logger.getLogger(PersonaRequestController.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(PersonaRequestController.class.getName()).log(Level.SEVERE, null, ex);
         }
        return "/WEB-INF/jsp/saludo.jsp";
    }
    
}

