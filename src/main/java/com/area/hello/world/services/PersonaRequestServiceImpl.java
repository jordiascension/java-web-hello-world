/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.hello.world.services;
import com.area.hello.world.models.Persona;
import com.area.hello.world.qualifiers.PersonaRequestServiceQualifier;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
/**
 *
 * @author jordi
 */
@RequestScoped
@PersonaRequestServiceQualifier
public class PersonaRequestServiceImpl implements PersonaService {

    @Override
    public Persona add(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Persona> getAll() {
        return new ArrayList<Persona>();  
    }
    
}
