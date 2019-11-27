/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.newtonpaiva.relatorios;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import br.com.newtonpaiva.relatorio.conf.AbrirRelatorio;
import br.com.newtonpaiva.relatorio.conf.AbrirRelatorio;
import br.com.newtonpaiva.relatorio.conf.ConnectionFactory;

/**
 *
 * @author Gustavo
 */
public class RelatorioMedico {
    
    public void abrirRelatorioMedico() {
 
        /*
         * Obtendo o arquivo do relatório.
         * Note que estamos utilizando um InputStream para obter o arquivo que
         * está dentro do nosso projeto. Fazendo isso, não teremos problema
         * quando nosso projeto for empacotado em um .jar.
         *
         * Note que o caminho do .jasper inicia com /, ou seja, a raiz da
         * localização das classes compiladas do nosso projeto
         * (o pacote default).
         *
         * Utilize a aba Files (canto superior esquerdo) e veja que os arquivos
         * .jasper e .jrxml são copiados para o diretório /build/classes
         * e por consequencia para o .jar que for criado.
         *
         * Se não os estiver vendo, mande dar um Clean and Build no projeto
         * (botão direito no nó raiz do projeto, Clean and Build (Limpar e Construir)
         *
         */
        InputStream inputStream = getClass().getResourceAsStream( "/Medico.jasper" );
 
        // mapa de parâmetros do relatório (ainda vamos aprender a usar)
        Map parametros = new HashMap();
 
        try {
 
            // abre o relatório
            AbrirRelatorio.openReport( "Medico", inputStream, parametros,
                    ConnectionFactory.getConnectionRelatorio() );
 
        } catch ( SQLException exc ) {
            exc.printStackTrace();
        } catch ( JRException exc ) {
            exc.printStackTrace();
        }
    }  
    
}
