/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.hello.world.dao;

import com.area.hello.world.models.Persona;
import java.util.List;

/**
 *
 * @author jordi
 */
public interface PersonaDao {
    Persona add(Persona persona);
    List<Persona> getAll();
}
