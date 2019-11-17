/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.newtonpaiva.centralleitos.modelos;

import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Tarley
 */
@Entity
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;    
    
    private String nome;
    private String nomeResp;
    private String nomeMedico;
    private String nomeEnfermeiro;
    
    @Temporal(TemporalType.DATE)
    private Calendar dataNascimento;
    @Temporal(TemporalType.DATE)
    private Calendar dataAdimissao;
    
    private String cpf;
    private String telefone;
    private String grauParentesco;
    private String cep;
    private String bairro;
    private String endereco;
    private String UF;
    private String cidade;
    private String dadosEnfermaria;
    private String clinica;
    private String telefoneClinica;
    private String pacienteOncologico;
    private String motivoInternacao;
    private String diagnosticoPrincipal;
    private String diagnosticoSecundario;
    private String intercorrencias;
    private String alergia;
    private String descAlergia;
    private String febre;
    private String internadoUti;
    private String isolamento;
    private String patogeno;
    private String cid;
    private String crm;
    private String coren;
    private Integer numero;
    private Double altura;
    private Double peso;
    //@Enumerated(EnumType.STRING)
    private String sexo;
    //@Enumerated(EnumType.ORDINAL)
    private String tipoSanguineo;

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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nomeResp
     */
    public String getNomeResp() {
        return nomeResp;
    }

    /**
     * @param nomeResp the nomeResp to set
     */
    public void setNomeResp(String nomeResp) {
        this.nomeResp = nomeResp;
    }

    /**
     * @return the nomeMedico
     */
    public String getNomeMedico() {
        return nomeMedico;
    }

    /**
     * @param nomeMedico the nomeMedico to set
     */
    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    /**
     * @return the nomeEnfermeiro
     */
    public String getNomeEnfermeiro() {
        return nomeEnfermeiro;
    }

    /**
     * @param nomeEnfermeiro the nomeEnfermeiro to set
     */
    public void setNomeEnfermeiro(String nomeEnfermeiro) {
        this.nomeEnfermeiro = nomeEnfermeiro;
    }

    /**
     * @return the dataNascimento
     */
    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the dataAdimissao
     */
    public Calendar getDataAdimissao() {
        return dataAdimissao;
    }

    /**
     * @param dataAdimissao the dataAdimissao to set
     */
    public void setDataAdimissao(Calendar dataAdimissao) {
        this.dataAdimissao = dataAdimissao;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        String cpfMoficado;
        
        cpfMoficado = cpf.replace(".", "");
        cpfMoficado = cpfMoficado.replace("-", "");
                
        this.cpf = cpfMoficado;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        String tel;
        
        tel = telefone.replace("(", "");
        tel = tel.replace(")", "");
        tel = tel.replace("-","");
        this.telefone = telefone;
    }

    /**
     * @return the grauParentesco
     */
    public String getGrauParentesco() {
        return grauParentesco;
    }

    /**
     * @param grauParentesco the grauParentesco to set
     */
    public void setGrauParentesco(String grauParentesco) {
        this.grauParentesco = grauParentesco;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the dadosEnfermaria
     */
    public String getDadosEnfermaria() {
        return dadosEnfermaria;
    }

    /**
     * @param dadosEnfermaria the dadosEnfermaria to set
     */
    public void setDadosEnfermaria(String dadosEnfermaria) {
        this.dadosEnfermaria = dadosEnfermaria;
    }

    /**
     * @return the clinica
     */
    public String getClinica() {
        return clinica;
    }

    /**
     * @param clinica the clinica to set
     */
    public void setClinica(String clinica) {
        this.clinica = clinica;
    }

    /**
     * @return the telefoneClinica
     */
    public String getTelefoneClinica() {
        String tel;
        
        tel = telefone.replace("(", "");
        tel = tel.replace(")", "");
        tel = tel.replace("-","");
        return telefoneClinica;
    }

    /**
     * @param telefoneClinica the telefoneClinica to set
     */
    public void setTelefoneClinica(String telefoneClinica) {
        this.telefoneClinica = telefoneClinica;
    }

    /**
     * @return the pacienteOncologico
     */
    public String getPacienteOncologico() {
        return pacienteOncologico;
    }

    /**
     * @param pacienteOncologico the pacienteOncologico to set
     */
    public void setPacienteOncologico(String pacienteOncologico) {
        this.pacienteOncologico = pacienteOncologico;
    }

    /**
     * @return the motivoInternacao
     */
    public String getMotivoInternacao() {
        return motivoInternacao;
    }

    /**
     * @param motivoInternacao the motivoInternacao to set
     */
    public void setMotivoInternacao(String motivoInternacao) {
        this.motivoInternacao = motivoInternacao;
    }

    /**
     * @return the diagnosticoPrincipal
     */
    public String getDiagnosticoPrincipal() {
        return diagnosticoPrincipal;
    }

    /**
     * @param diagnosticoPrincipal the diagnosticoPrincipal to set
     */
    public void setDiagnosticoPrincipal(String diagnosticoPrincipal) {
        this.diagnosticoPrincipal = diagnosticoPrincipal;
    }

    /**
     * @return the diagnosticoSecundario
     */
    public String getDiagnosticoSecundario() {
        return diagnosticoSecundario;
    }

    /**
     * @param diagnosticoSecundario the diagnosticoSecundario to set
     */
    public void setDiagnosticoSecundario(String diagnosticoSecundario) {
        this.diagnosticoSecundario = diagnosticoSecundario;
    }

    /**
     * @return the intercorrencias
     */
    public String getIntercorrencias() {
        return intercorrencias;
    }

    /**
     * @param intercorrencias the intercorrencias to set
     */
    public void setIntercorrencias(String intercorrencias) {
        this.intercorrencias = intercorrencias;
    }

    /**
     * @return the alergia
     */
    public String getAlergia() {
        return alergia;
    }

    /**
     * @param alergia the alergia to set
     */
    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    /**
     * @return the descAlergia
     */
    public String getDescAlergia() {
        return descAlergia;
    }

    /**
     * @param descAlergia the descAlergia to set
     */
    public void setDescAlergia(String descAlergia) {
        this.descAlergia = descAlergia;
    }

    /**
     * @return the febre
     */
    public String getFebre() {
        return febre;
    }

    /**
     * @param febre the febre to set
     */
    public void setFebre(String febre) {
        this.febre = febre;
    }

    /**
     * @return the internadoUti
     */
    public String getInternadoUti() {
        return internadoUti;
    }

    /**
     * @param internadoUti the internadoUti to set
     */
    public void setInternadoUti(String internadoUti) {
        this.internadoUti = internadoUti;
    }

    /**
     * @return the isolamento
     */
    public String getIsolamento() {
        return isolamento;
    }

    /**
     * @param isolamento the isolamento to set
     */
    public void setIsolamento(String isolamento) {
        this.isolamento = isolamento;
    }

    /**
     * @return the patogeno
     */
    public String getPatogeno() {
        return patogeno;
    }

    /**
     * @param patogeno the patogeno to set
     */
    public void setPatogeno(String patogeno) {
        this.patogeno = patogeno;
    }

    /**
     * @return the cid
     */
    public String getCid() {
        return cid;
    }

    /**
     * @param cid the cid to set
     */
    public void setCid(String cid) {
        this.cid = cid;
    }

    /**
     * @return the crm
     */
    public String getCrm() {
        return crm;
    }

    /**
     * @param crm the crm to set
     */
    public void setCrm(String crm) {
        this.crm = crm;
    }

    /**
     * @return the coren
     */
    public String getCoren() {
        return coren;
    }

    /**
     * @param coren the coren to set
     */
    public void setCoren(String coren) {
        this.coren = coren;
    }

    /**
     * @return the numero
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    /**
     * @return the altura
     */
    public Double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(Double altura) {
        this.altura = altura;
    }

    /**
     * @return the peso
     */
    public Double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Double peso) {
        this.peso = peso;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the tipoSanguineo
     */
    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    /**
     * @param tipoSanguineo the tipoSanguineo to set
     */
    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    /**
     * @return the UF
     */
    public String getUF() {
        return UF;
    }

    /**
     * @param UF the UF to set
     */
    public void setUF(String UF) {
        this.UF = UF;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void addEndereco(Endereco endereco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
