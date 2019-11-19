/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.newtonpaiva.centralleitos.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Kaique
 */
@Entity
public class AutenticConfig {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column
    private String autenticConfig;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the autenticConfig
     */
    public String getAutenticConfig() {
        return autenticConfig;
    }

    /**
     * @param autenticConfig the autenticConfig to set
     */
    public void setAutenticConfig(String autenticConfig) {
        this.autenticConfig = autenticConfig;
    }

   
    
    
}
