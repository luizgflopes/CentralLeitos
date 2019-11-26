/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.newtonpaiva.centralleitos.modelo;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author 12103162
 */
@Entity
public class TipoLeito {
    //STATUS NA TELA: variável oculta
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    //STATUS NA TELA: variável a ser cadastrada pelo usuário
    @Column
    private String descricao;
    
    //STATUS NA TELA: variável gerada automaticamente apenas para visualização
    @Column
    private String chave;
    //chave composta das 3 primeiras letras da variavel 'descricao'
    //caso haja uma incidência igual, o sistema deverá verificar a próxima 
    //letra final até que seja gerada uma chave única
    
    //relação com a tabela Leito (através da variável chave)
    @OneToMany(mappedBy = "tipoLeito", cascade = CascadeType.ALL)
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
       
}
