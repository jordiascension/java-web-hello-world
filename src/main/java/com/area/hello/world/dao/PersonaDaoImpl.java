/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.hello.world.dao;

import com.area.hello.world.models.Persona;
import java.util.List;
import javax.enterprise.context.Dependent;

/**
 *
 * @author jordi
 */
@Dependent
public class PersonaDaoImpl implements PersonaDao {
    
    public Persona add(Persona persona){
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Persona> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
