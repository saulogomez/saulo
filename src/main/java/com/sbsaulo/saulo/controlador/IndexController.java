/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbsaulo.saulo.controlador;

import com.sbsaulo.saulo.Entidades.Persona;
import com.sbsaulo.saulo.dao.IPersonaDao;
import com.sbsaulo.saulo.dao.PersonaDao;
import com.sbsaulo.saulo.service.IIndexServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DGOMEZ
 */
@RestController
@RequestMapping("index")
public class IndexController {
    
    @Autowired
    public IIndexServicio indexServicio;
    @Autowired
    public IPersonaDao personaDao;
    
   @GetMapping("mensaje")
    public String mensaje(){
        String mensajeDeServicio=indexServicio.devolverMensaje();
        
        return mensajeDeServicio + " saulo";
    }
    
    @GetMapping("suma")
    public int numero(){
        int n1=6,n2=9;
        int suma =n1+n2;
        return suma;
    }
    
    @GetMapping("persona")
    public Persona obtenerPersona(){
        return personaDao.findOne(new Long(1));
    }
    
  }
