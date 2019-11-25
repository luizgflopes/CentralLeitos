/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.newtonpaiva.centralleitos.modelos;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author Tarley
 */
@Entity
public class Leito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column
    private String ala;

    @OneToMany(mappedBy = "leito", cascade = CascadeType.ALL)
    private List<Ocupacao> ocupacoes;
    
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
     * @return the ala
     */
    public String getAla() {
        return ala;
    }

    /**
     * @param ala the ala to set
     */
    public void setAla(String ala) {
        this.ala = ala;
    }

    /**
     * @return the ocupacoes
     */
    public List<Ocupacao> getOcupacoes() {
        return ocupacoes;
    }

    /**
     * @param ocupacoes the ocupacoes to set
     */
    public void setOcupacoes(List<Ocupacao> ocupacoes) {
        this.ocupacoes = ocupacoes;
    }
    
    
}
