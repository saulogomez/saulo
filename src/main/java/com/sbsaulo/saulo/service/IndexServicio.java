/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbsaulo.saulo.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author DGOMEZ
 */

@Service
public class IndexServicio implements IIndexServicio {

    @Override
    public String devolverMensaje() {
        return "Bienvenido a Spring";
    }
    
    
}
