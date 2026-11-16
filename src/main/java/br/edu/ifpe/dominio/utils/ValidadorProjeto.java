package br.edu.ifpe.dominio.utils;



public class ValidadorProjeto {

	public static boolean podeEditar(StatusProjeto status) {
		
		if(status != StatusProjeto.EM_CORRECAO && status != StatusProjeto.RASCUNHO) {
			return false;
		}else {
			return true;
		}
	}
}
