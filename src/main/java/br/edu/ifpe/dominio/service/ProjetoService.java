package br.edu.ifpe.dominio.service;

import br.edu.ifpe.dominio.model.Projeto;
import br.edu.ifpe.dominio.model.repository.ProjetoRepository;
import br.edu.ifpe.dominio.utils.ValidadorProjeto;

public class ProjetoService {

	
	public void editarProjeto(String titulo) {
		
		Projeto projetoEcontrado = ProjetoRepository.read(titulo);
		
		//se achar
		if(projetoEcontrado != null) {
			System.out.print("achou projeto");
		}else {
			System.out.print("projeto não encontrado");
			return;
		}
		
		//editar
		if(!ValidadorProjeto.podeEditar(projetoEcontrado.getStatus())) {
			throw new IllegalStateException("Não é possível editar um projeto neste status.");
		}else {
			//TODO
			//form de edição
		}
	}
}
