package br.edu.ifpe.dominio.service;

//import br.edu.ifpe.dominio.model.Usuario;
import br.edu.ifpe.dominio.model.repository.UsuarioRepository;

public class ValidadorCadastroUsuario {
	

	//cpf
	public static boolean verificarCPF(String cpf) {
       
		//verifica usuário escreveu a entrada
		if (cpf == null) {
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

        if (segundoDigito != Character.getNumericValue(cpf.charAt(10))) {
        	return false;
        }
        
      //verifica se já existe
        return (UsuarioRepository.read(cpf) == null);
        	
        
        
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
    	
//    	if(UsuarioRepository.readElementsByEmail(email) == null) {
//    		return false;
//    	}
    	
    	String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    	
//    	if(email.matches(regex)) {
//    		return true;
//    	}else {
//    		return false;
//    	}

        return email.matches(regex);
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
        
    	if(valor != null && !valor.isBlank()) {
    		System.out.println("campo obrigatório, tente novamente.");
    		return true;
    	} else {return false;}
        
    }
    
}
