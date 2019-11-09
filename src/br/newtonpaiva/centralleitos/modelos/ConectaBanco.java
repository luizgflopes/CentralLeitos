/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.newtonpaiva.centralleitos.modelos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class ConectaBanco {
        public Statement stm;
        public ResultSet rs;
        private String driver = "com.mysql.jdbc.Driver";
        private String caminho = "jdbc:mysql://localhost:3306/central-leitos-db?zeroDateTimeBehavior=convertToNull";
        private String usuario = "root";
        private String senha = "";
        public Connection con;
        
        public void conectar(){
            
            try {
                System.setProperty("jdbc.Driver", driver);
                con = DriverManager.getConnection(caminho, usuario, senha);
            } catch (SQLException ex) {
                Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public void desconectaBD(){
            
            try {
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Desconectado!");
            }
        }
        
        public void excutaSQL(String sql) throws SQLException{
                        stm= (Statement) con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                            rs=stm.executeQuery(sql);
 }
}
