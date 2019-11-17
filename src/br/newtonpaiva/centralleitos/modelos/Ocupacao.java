/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.newtonpaiva.centralleitos.modelos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Tarley
 */
@Entity
public class Ocupacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Calendar dataEntrada;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Calendar dataSaida;

    @ManyToOne
    @JoinColumn
    private Leito leito;
    
    @ManyToMany
    private List<Procedimento> procedimentos;
    
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
     * @return the dataEntrada
     */
    public Calendar getDataEntrada() {
        return dataEntrada;
    }

    /**
     * @param dataEntrada the dataEntrada to set
     */
    public void setDataEntrada(Calendar dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    /**
     * @return the dataSaida
     */
    public Calendar getDataSaida() {
        return dataSaida;
    }

    /**
     * @param dataSaida the dataSaida to set
     */
    public void setDataSaida(Calendar dataSaida) {
        this.dataSaida = dataSaida;
    }

    /**
     * @return the leito
     */
    public Leito getLeito() {
        return leito;
    }

    /**
     * @param leito the leito to set
     */
    public void setLeito(Leito leito) {
        this.leito = leito;
    }

    /**
     * @return the procedimentos
     */
    public List<Procedimento> getProcedimentos() {
        return procedimentos;
    }

    /**
     * @param procedimentos the procedimentos to set
     */
    public void setProcedimentos(List<Procedimento> procedimentos) {
        this.procedimentos = procedimentos;
    }
    
    public void addProcedimento (Procedimento proc){
        if(procedimentos == null)
            procedimentos = new ArrayList<>();
        procedimentos.add(proc);
    }

}
