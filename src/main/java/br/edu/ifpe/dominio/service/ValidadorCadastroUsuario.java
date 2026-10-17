package br.edu.ifpe.dominio.service;

//import br.edu.ifpe.dominio.model.Usuario;
import br.edu.ifpe.dominio.model.repository.UsuarioRepository;

public class ValidadorCadastroUsuario {
	

	//cpf
	public static boolean verificarCPF(String cpf) {
        if (cpf == null) {
            return false;
        }
        
        //verifica se já existe
        if(UsuarioRepository.read(cpf) == null) {
        	return false;
        }

        // Aceita CPF com ou sem pontuação.
        cpf = cpf.replace(".", "").replace("-", "");

        // Verifica se possui exatamente 11 dígitos.
        if (!cpf.matches("\\d{11}")) {
            return false;
        }

        // Rejeita CPFs com todos os dígitos iguais.
        if (cpf.chars().distinct().count() == 1) {
            return false;
        }

        // Calcula e verifica o primeiro dígito.
        int primeiroDigito = calcularDigito(cpf, 9);

        if (primeiroDigito != Character.getNumericValue(cpf.charAt(9))) {
            return false;
        }

        // Calcula e verifica o segundo dígito.
        int segundoDigito = calcularDigito(cpf, 10);

        return segundoDigito
                == Character.getNumericValue(cpf.charAt(10));
    }

    private static int calcularDigito(String cpf, int quantidade) {
        int soma = 0;

        for (int i = 0; i < quantidade; i++) {
            soma += Character.getNumericValue(cpf.charAt(i))
                    * (quantidade + 1 - i);
        }

        int resto = soma % 11;

        return resto < 2 ? 0 : 11 - resto;
    }

    
    //email
    public static boolean verificarEmail(String email) {
    	
    	if(email == null || email.isBlank()) {
    		return false;
    	}
    	
    	if(UsuarioRepository.readElementsByEmail(email) == null) {
    		return false;
    	}
    	
    	String regex = "^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$";
    	
    	if(email.matches(regex)) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
    //senha maior que 6 dígitos
    public static boolean verificarSenha(String senha) {
    	
    	if(senha.length() >= 6) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
    
    public static boolean verificarCampoObrigatorio(String valor) {
        return valor != null && !valor.isBlank();
    }
    
}
