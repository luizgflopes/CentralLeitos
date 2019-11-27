/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.newtonpaiva.centralleitos.modelo;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author 12103162
 */
@Entity
public class QuantidadeLeitos {
    //gerar uma opção de tela apenas para consulta

    //STATUS NA TELA: variável oculta
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    //relação com a tabela TipoLeito (através da variável chave)
    //STATUS NA TELA: variável gerada automaticamente apenas para visualização
    @ManyToMany
    private List<String> tipoLeito;
    
    //relação com a tabela Ala (através da variável chave)
    //STATUS NA TELA: variável gerada automaticamente apenas para visualização
    @ManyToMany
    private List<String> ala;
    
    //STATUS NA TELA: variável gerada automaticamente apenas para visualização
    @Column
    private Integer quantidade;
    //sempre que um novo leito for cadastrado para um determinado TipoLeito e
    //uma Ala, o valor desta variável na linha correspondente as primeiras 
    //classes deverá ser incrementado

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<String> getTipoLeito() {
        return tipoLeito;
    }

    public void setTipoLeito(List<String> tipoLeito) {
        this.tipoLeito = tipoLeito;
    }

    public List<String> getAla() {
        return ala;
    }

    public void setAla(List<String> ala) {
        this.ala = ala;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
}
