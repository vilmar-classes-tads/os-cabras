/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpe.dominio.service;

import br.edu.ifpe.dominio.model.Usuario;
import br.edu.ifpe.dominio.model.repository.UsuarioRepository;
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

        //nome
        System.out.print("Nome completo: \n");
        String nomeCompleto = scanner.nextLine();

        //cpf
        System.out.print("\ndigite o cpf - somente numeros: ");
        String cpf = scanner.nextLine();

        //email
        System.out.print("\ninsira o email: ");
        String email = scanner.nextLine();

        //senha
        System.out.print("\ninsira senha: ");
        String senha = scanner.nextLine();

        //campus
        System.out.print("\nQual o campus: ");
        String campus = scanner.nextLine();

        //areas formacao
        List<String> areasFormacao = new ArrayList<>();

        System.out.println("\nDigite suas áreas de formação.");
        System.out.println(" Digite '-' quando terminar.");

        while (true) {
            System.out.print("Area: ");
            String area = scanner.nextLine();

            if (area.equalsIgnoreCase("-")) {
                break;
            }

            areasFormacao.add(area);
        }

        List<String> titulacoes = new ArrayList<>();

        System.out.println("\nTitulações.");
        System.out.println(" Digite '-' para terminar.\n");

        while (true) {
            System.out.print("Titulação: ");
            String titulacao = scanner.nextLine();

            if (titulacao.equalsIgnoreCase("-")) {
                break;
            }

            titulacoes.add(titulacao);
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
        
        System.out.println("=== Fim do cadastro ===");
    }
}
