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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author 12103162
 */
@Entity
public class Leito {
    //STATUS NA TELA: variável oculta
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    //STATUS NA TELA: variável a ser cadastrada pelo usuário
    //relação com a tabela Ala (através da variável chave)
    @OneToOne
    @JoinColumn
    private String ala;
    //combobox com seleção de acordo com os objetos cadastrados na tabela Ala
    
    //relação com a tabela TipoLeito (através da variável chave)
    //STATUS NA TELA: variável a ser cadastrada pelo usuário
    @OneToOne
    @JoinColumn
    private String tipoLeito;
    //combobox com seleção de acordo com os objetos cadastrados na tabela
    //TipoLeito
    
    //STATUS NA TELA: variável gerada automaticamente apenas para visualização
    @Column
    private String chave;
    //chave composta da 'chave' da classe Ala seguida da 'chave' da classe
    //TipoLeito e finalmente seguida do numero da 'quantidade' +1 da clase
    //QuantidadeLeitos
    
    //relação com a tabela Ocupacao (através da variável id)
    @OneToMany(mappedBy = "leito", cascade = CascadeType.ALL)
    private List<Integer> ocupacoes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAla() {
        return ala;
    }

    public void setAla(String ala) {
        this.ala = ala;
    }
    
    
    public String getTipoLeito() {
        return tipoLeito;
    }

    public void setTipoLeito(String tipoLeito) {
        this.tipoLeito = tipoLeito;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public List<Integer> getOcupacoes() {
        return ocupacoes;
    }

    public void setOcupacoes(List<Integer> ocupacoes) {
        this.ocupacoes = ocupacoes;
    }
    
    
    
}
