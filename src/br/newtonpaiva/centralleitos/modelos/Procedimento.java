/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.newtonpaiva.centralleitos.modelos;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author 12104073
 */
@Entity
public class Procedimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;
    //private Long duracaoMediaEmMinutos;
    private boolean ativo;
    private boolean temImagem;
    //@ManyToMany(mappedBy = "procedimentos")
    //private List<Ocupacao> ocupacoes;

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
     * @return the duracaoMediaEmMinutos
     
    public Long getDuracaoMediaEmMinutos() {
        return duracaoMediaEmMinutos;
    }

    /**
     * @param duracaoMediaEmMinutos the duracaoMediaEmMinutos to set
     
    public void setDuracaoMediaEmMinutos(Long duracaoMediaEmMinutos) {
        this.duracaoMediaEmMinutos = duracaoMediaEmMinutos;
    }
    */

    /**
     * @return the ocupacoes
     */
    /**
     * public List<Ocupacao> getOcupacoes() { return ocupacoes; }
     *
     * /
     *
     **
     * @param ocupacoes the ocupacoes to set
     *
     * public void setOcupacoes(List<Ocupacao> ocupacoes) { this.ocupacoes =
     * ocupacoes; }
     */
    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the ativo
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    /**
     * @return the temImagem
     */
    public boolean isTemImagem() {
        return temImagem;
    }

    /**
     * @param temImagem the temImagem to set
     */
    public void setTemImagem(boolean temImagem) {
        this.temImagem = temImagem;
    }
}
