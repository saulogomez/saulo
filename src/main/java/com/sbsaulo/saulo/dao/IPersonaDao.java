/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbsaulo.saulo.dao;

import com.sbsaulo.saulo.Entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author DGOMEZ
 */
public interface IPersonaDao extends JpaRepository<Persona, Long> {
    
}
