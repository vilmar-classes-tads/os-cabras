package br.edu.ifpe.dominio;

import br.edu.ifpe.dominio.service.CadastroUsuario;
import br.edu.ifpe.dominio.model.Usuario;
import br.edu.ifpe.dominio.model.repository.UsuarioRepository;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		CadastroUsuario cadastro = new CadastroUsuario();
		cadastro.cadastrar();
		
		
		// teste:
		List<Usuario> usuarios = UsuarioRepository.readAll();

		System.out.println("Usuários cadastrados: " + usuarios.size());

		if (!usuarios.isEmpty()) {
		    Usuario ultimo = usuarios.get(usuarios.size() - 1);

		    System.out.println("Nome: " + ultimo.getNomeCompleto());
		    System.out.println("CPF: " + ultimo.getCpf());
		    System.out.println("Perfis: " + ultimo.getPerfis());

		    boolean temAvaliador = ultimo.getPerfis()
		            .contains(Usuario.Perfil.ROLE_AVALIADOR);

		    boolean temCoordenador = ultimo.getPerfis()
		            .contains(Usuario.Perfil.ROLE_COORDENADOR);

		    System.out.println("Possui perfil avaliador: " + temAvaliador);
		    System.out.println("Possui perfil coordenador: " + temCoordenador);
		}
	}
}
