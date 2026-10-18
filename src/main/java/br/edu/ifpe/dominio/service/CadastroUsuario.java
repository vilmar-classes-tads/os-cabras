/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpe.dominio.service;

import br.edu.ifpe.dominio.model.Usuario;
import br.edu.ifpe.dominio.model.repository.UsuarioRepository;
import br.edu.ifpe.dominio.service.ValidadorCadastroUsuario;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Educação
 */
public class CadastroUsuario {

    Scanner scanner = new Scanner(System.in);

    public void cadastrar() {

        System.out.println("=== Formulario de Cadastro Usuario ===\n");
        String nomeCompleto;
        String cpf;
        String email;
        String senha;
        String campus;
        List<String> areasFormacao = new ArrayList<>();
        List<String> titulacoes = new ArrayList<>();
        
        
        //nome
        while(true) {
        	System.out.print("Nome completo: \n");
            nomeCompleto = scanner.nextLine();
            
            
            if(ValidadorCadastroUsuario.verificarCampoObrigatorio(nomeCompleto)) {
            	break;
            }
            
        }
        
        while(true) {
        	
        	//cpf
            System.out.print("\ndigite o cpf - somente numeros: ");
            cpf = scanner.nextLine();
            
            if(ValidadorCadastroUsuario.verificarCPF(cpf)) {
            	break;
            }else {
            	System.out.println("CPF errado, tente novamente. ");
            }
        	
        }
        
        while(true) {
        	//email
            System.out.print("\ninsira o email: ");
            email = scanner.nextLine();
            
            if(ValidadorCadastroUsuario.verificarEmail(email)) {
            	break;
            }else {
            	System.out.println("email inválido. ");
            }
        }

        
        while(true) {
        	//senha
            System.out.print("\ninsira senha: ");
            senha = scanner.nextLine();
            
            if(ValidadorCadastroUsuario.verificarSenha(senha)) {
            	break;
            }else {
            	System.out.println("senha deve ter, no mínimo, 6 dígitos. ");
            }
        }

        
        while(true) {
        	//campus
            System.out.print("\nQual o campus: ");
            campus = scanner.nextLine();
            
            if(ValidadorCadastroUsuario.verificarCampoObrigatorio(campus)) {
            	break;
            }else {
            	System.out.println("insira um campus. ");
            }
        }
        

        

        //areas formacao
        

        System.out.println("\nDigite suas áreas de formação.");
        System.out.println("Digite '-' quando terminar.");

        while (true) {
            System.out.print("Área: ");
            String area = scanner.nextLine();

            if (area.equalsIgnoreCase("-")) {
                if (areasFormacao.isEmpty()) {
                    System.out.println("Informe pelo menos uma área de formação.");
                    continue;
                }
                break;
            }

            if (ValidadorCadastroUsuario.verificarCampoObrigatorio(area)) {
                areasFormacao.add(area);
            } else {
                System.out.println("A área de formação não pode ficar vazia.");
            }
        }

        
        //titulações

        System.out.println("\nTitulações.");
        System.out.println("Digite '-' para terminar.\n");

        while (true) {
            System.out.print("Titulação: ");
            String titulacao = scanner.nextLine();

            if (titulacao.equalsIgnoreCase("-")) {
                if (titulacoes.isEmpty()) {
                    System.out.println("Informe pelo menos uma titulação.");
                    continue;
                }
                break;
            }

            if (ValidadorCadastroUsuario.verificarCampoObrigatorio(titulacao)) {
                titulacoes.add(titulacao);
            } else {
                System.out.println("A titulação não pode ficar vazia.");
            }
        }

        // Nome social
        System.out.print("\nNome social (opcional): ");
        String nomeSocial = scanner.nextLine();

        // Sexo
        System.out.print("\nSexo (opcional): ");
        String sexo = scanner.nextLine();

        // Lattes
        System.out.print("\nLink do Lattes (opcional): ");
        String linkLattes = scanner.nextLine();

        // Telefone
        System.out.print("\nTelefone (opcional): ");
        String telefone = scanner.nextLine();

        // Criação do usuário
        Usuario usuario = new Usuario();

        usuario.setNomeCompleto(nomeCompleto);
        usuario.setCpf(cpf);
        usuario.setEmail(email);
        usuario.setSenha(senha);
        usuario.setCampus(campus);
        usuario.setAreasFormacao(areasFormacao);
        usuario.setTitulacoes(titulacoes);
        usuario.setNomeSocial(nomeSocial);
        usuario.setSexo(sexo);
        usuario.setLinkLattes(linkLattes);
        usuario.setTelefone(telefone);
        
        //adicionando perfis:
        usuario.getPerfis().add(Usuario.Perfil.ROLE_AVALIADOR);
        usuario.getPerfis().add(Usuario.Perfil.ROLE_COORDENADOR);
        
        
        //Aidicionando Usuario
        UsuarioRepository.create(usuario);
        
        System.out.println("=== Fim do cadastro ===");
    }
}
