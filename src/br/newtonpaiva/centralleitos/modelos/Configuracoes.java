package br.newtonpaiva.centralleitos.modelos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;


/**
 *
 * @author 12104050
 */
public class Configuracoes {
    
    public String pegaCodigoUnidade() throws IOException {
       FileReader ler = new FileReader("configAut.txt");
       BufferedReader reader = new BufferedReader(ler);  
       String consulta;
            consulta = reader.readLine();
            if (consulta.equals(""))
                return null;
            else return consulta;
        
    } 
    
            
}
