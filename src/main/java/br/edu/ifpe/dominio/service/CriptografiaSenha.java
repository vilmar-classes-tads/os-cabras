package br.edu.ifpe.dominio.service;

import org.mindrot.jbcrypt.BCrypt;

public class CriptografiaSenha {
	
	public static String gerarHash(String senha) {
		return BCrypt.hashpw(senha, BCrypt.gensalt(12));
	}
	
	
	public static boolean verificarSenha(String senha, String hash) {
		return BCrypt.checkpw(senha, hash);
	}
}
