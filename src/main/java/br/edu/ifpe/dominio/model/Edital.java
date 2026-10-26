package br.edu.ifpe.dominio.model;

import java.time.LocalDate;

//Título, Número, Ano, Data Início Submissão, Data Fim Submissão, Data Início Avaliação e Data Fim Avaliação.

public class Edital {

	private String titulo;
	private int numero;
	
	private LocalDate dataInicioSubmissao;
	private LocalDate dataFimSubmissao;
	private LocalDate dataInicioAvaliacao;
	private LocalDate dataFimAvaliacao;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public LocalDate getDataInicioSubmissao() {
		return dataInicioSubmissao;
	}
	public void setDataInicioSubmissao(LocalDate dataInicioSubmissao) {
		this.dataInicioSubmissao = dataInicioSubmissao;
	}
	public LocalDate getDataFimSubmissao() {
		return dataFimSubmissao;
	}
	public void setDataFimSubmissao(LocalDate dataFimSubmissao) {
		this.dataFimSubmissao = dataFimSubmissao;
	}
	public LocalDate getDataInicioAvaliacao() {
		return dataInicioAvaliacao;
	}
	public void setDataInicioAvaliacao(LocalDate dataInicioAvaliacao) {
		this.dataInicioAvaliacao = dataInicioAvaliacao;
	}
	public LocalDate getDataFimAvaliacao() {
		return dataFimAvaliacao;
	}
	public void setDataFimAvaliacao(LocalDate dataFimAvaliacao) {
		this.dataFimAvaliacao = dataFimAvaliacao;
	}
	
	
	
}
