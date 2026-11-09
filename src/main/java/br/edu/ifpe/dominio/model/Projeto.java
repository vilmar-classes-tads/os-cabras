package br.edu.ifpe.dominio.model;
import br.edu.ifpe.dominio.utils.ODS;
import br.edu.ifpe.dominio.utils.StatusProjeto;

import java.util.List;

public class Projeto {
	
	private String titulo;
	private String resumo;
	private String campus;
	private boolean aceito;
	
	private List<String> palavrasChave;
	private List<String> publicoAlvo;
	private List<String> areaTematica;
	private List<ODS> ods;
	private StatusProjeto status;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titilo) {
		this.titulo = titilo;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	public List<String> getPalavrasChave() {
		return palavrasChave;
	}
	public void setPalavrasChave(List<String> palavrasChave) {
		this.palavrasChave = palavrasChave;
	}
	public List<String> getPublicoAlvo() {
		return publicoAlvo;
	}
	public void setPublicoAlvo(List<String> publicoAlvo) {
		this.publicoAlvo = publicoAlvo;
	}
	public List<String> getAreaTematica() {
		return areaTematica;
	}
	public void setAreaTematica(List<String> areaTematica) {
		this.areaTematica = areaTematica;
	}
	public String getCampus() {
		return campus;
	}
	public void setCampus(String campus) {
		this.campus = campus;
	}
	public List<ODS> getOds() {
		return ods;
	}
	public void setOds(List<ODS> ods) {
		this.ods = ods;
	}
	public boolean isAceito() {
		return aceito;
	}
	public void setAceito(boolean aceito) {
		this.aceito = aceito;
	}
	public StatusProjeto getStatus() {
		return status;
	}
	public void setStatus(StatusProjeto status) {
		this.status = status;
	}
	
}
