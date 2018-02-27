/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbsaulo.saulo.controlador;

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
    
   @GetMapping("mensaje")
    public String mensaje(){
        return "saulo";
    }
    
    @GetMapping("suma")
    public int numero(){
        int n1=6,n2=9;
        int suma =n1+n2;
        return suma;
    }
    
  }
