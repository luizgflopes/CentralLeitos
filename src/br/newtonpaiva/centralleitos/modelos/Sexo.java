/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.newtonpaiva.centralleitos.modelos;

/**
 *
 * @author 12104073
 */
public enum Sexo {
    MASCULINO("1"), 
    FEMININO("2"), 
    OUTROS("3");
    
    private String escolhaSexo;
    
    Sexo(String sexo){
        escolhaSexo = sexo;
    }
}
