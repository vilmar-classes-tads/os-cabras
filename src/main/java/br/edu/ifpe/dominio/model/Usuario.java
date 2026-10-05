/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpe.dominio.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Usuario {

    private String nomeCompleto;
    private String cpf;
    private String email;
    private String senha;
    private String campus;

    private List<String> titulacoes;
    private List<String> areasFormacao;
    private Set<Perfil> perfis;

    // Opcionais
    private String nomeSocial;
    private String sexo;
    private String linkLattes;
    private String telefone;

    public enum Perfil {
        ROLE_COORDENADOR,
        ROLE_AVALIADOR
    }

    public Usuario() {
        perfis = new HashSet<>();
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public List<String> getTitulacoes() {
        return titulacoes;
    }

    public void setTitulacoes(List<String> titulacoes) {
        this.titulacoes = titulacoes;
    }

    public List<String> getAreasFormacao() {
        return areasFormacao;
    }

    public void setAreasFormacao(List<String> areasFormacao) {
        this.areasFormacao = areasFormacao;
    }

    public Set<Perfil> getPerfis() {
        return perfis;
    }

    public void setPerfis(Set<Perfil> perfis) {
        this.perfis = perfis;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLinkLattes() {
        return linkLattes;
    }

    public void setLinkLattes(String linkLattes) {
        this.linkLattes = linkLattes;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}