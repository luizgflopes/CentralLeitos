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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author 12103162
 */
@Entity
public class Ala {
    //STATUS NA TELA: variável oculta
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    //STATUS NA TELA: variável a ser cadastrada pelo usuário
    @Column
    private String descricao;
    
    //STATUS NA TELA: variável gerada automaticamente apenas para visualização
    @Column
    private Integer qtd_leitos;
    //quantidade atual de leitos cadastrados na ala
    
    //STATUS NA TELA: variável a ser cadastrada pelo usuário
    @Column
    private Integer qtd_max_leitos;
    //caso o usuario tente criar um leito e o valor da variável qtd_leitos seja
    //igual a esta variável o sistema deverá impedir a criação de um novo leito
    //o usuário também não poderá editar esta variável para um valor menor que
    //a variável qtd_leitos - o sistema deverá exibir uma mensagem solicitando
    //ao usuário que exclua leitos desta ala caso queira reduzir sua quantidade
    //máxima de leitos
    
    //STATUS NA TELA: variável gerada automaticamente apenas para visualização
    @Column
    private String chave;
    //chave composta das 3 primeiras letras da variável 'descricao'
    //caso haja uma incidência igual, o sistema deverá verificar a próxima 
    //letra final até que seja gerada uma chave única
    
    //STATUS NA TELA: variável gerada automaticamente apenas para visualização
    
    private String unidade;
    //valor automático de acordo com a do usuário que cadastra a ala
    
    //relação com a tabela Leito (através da variável chave)
    
    private List<String> leitos;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public List<String> getLeitos() {
        return leitos;
    }

    public void setLeitos(List<String> leitos) {
        this.leitos = leitos;
    }  

    public Integer getQtd_max_leitos() {
        return qtd_max_leitos;
    }

    public void setQtd_max_leitos(Integer qtd_max_leitos) {
        this.qtd_max_leitos = qtd_max_leitos;
    }

    public Integer getQtd_leitos() {
        return qtd_leitos;
    }

    public void setQtd_leitos(Integer qtd_leitos) {
        this.qtd_leitos = qtd_leitos;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    
}
