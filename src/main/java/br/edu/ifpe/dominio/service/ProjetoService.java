package br.edu.ifpe.dominio.service;

import br.edu.ifpe.dominio.model.Projeto;
import br.edu.ifpe.dominio.model.repository.ProjetoRepository;
import br.edu.ifpe.dominio.utils.ValidadorProjeto;

public class ProjetoService {

	
	public void editarProjeto(Integer id, Projeto novosDados) {

	    Projeto projetoEncontrado = ProjetoRepository.read(id);

	    // 1. Verifica se o projeto existe
	    if (projetoEncontrado == null) {
	        throw new IllegalArgumentException("Projeto não encontrado.");
	    }

	    // 2. Verifica se o status permite edição
	    if (!ValidadorProjeto.podeEditar(projetoEncontrado.getStatus())) {
	        throw new IllegalStateException(
	            "Não é possível editar um projeto neste status."
	        );
	    }

	    // 3. Atualiza os dados do projeto
	    boolean atualizado = ProjetoRepository.update(id, novosDados);

	    if (!atualizado) {
	        throw new IllegalStateException("Não foi possível atualizar o projeto.");
	    }
	}
}
