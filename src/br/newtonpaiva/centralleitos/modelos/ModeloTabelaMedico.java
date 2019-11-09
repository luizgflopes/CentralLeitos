/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.newtonpaiva.centralleitos.modelos;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Gustavo
 */
public class ModeloTabelaMedico extends AbstractTableModel{
    private ArrayList linhas = null;
    private String[] colunas = null;
    
    public void removeLinha(int linha){
        this.linhas.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
    public ModeloTabelaMedico(ArrayList linha, String[] coluna){
        setLinhas(linha);
        setColunas(coluna);
    }

    /**
     * @return the linhas
     */
    public ArrayList getLinhas() {
        return linhas;
    }

    /**
     * @param linhas the linhas to set
     */
    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    /**
     * @return the colunas
     */
    public String[] getColunas() {
        return colunas;
    }

    /**
     * @param colunas the colunas to set
     */
    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    
    //Contar numeros de colunas
    public int getColumnCount(){
        return colunas.length;
    }
    
    //Contar numero de linhas
    public int getRowCount(){
        return linhas.size();
    }
    
    public String getColumnName(int numColuna){
        return colunas[numColuna];
    }
    
    public Object getValueAt(int numLinha, int numColuna){
        Object[] linha = (Object[])getLinhas().get(numLinha);
        return linha[numColuna];
    }
}
