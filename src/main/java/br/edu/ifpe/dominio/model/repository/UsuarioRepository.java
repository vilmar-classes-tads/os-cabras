/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpe.dominio.model.repository;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpe.dominio.model.Usuario;

/**
 *
 * @author Educação
 */
public class UsuarioRepository {
    
    private static List<Usuario> usuarios = new ArrayList();
    
    public static void create(Usuario u){
        usuarios.add(u);
    }

    public static Usuario read(String cpf){
        for(Usuario usuario : usuarios){
            if(usuario.getCpf().equals(cpf)){
                return usuario;
            }
        }
        return null;
    }

    public static boolean update(Usuario usuario){
        for(int i = 0; i < usuarios.size(); i++){
           if(usuarios.get(i).getCpf().equals(usuario.getCpf())){
               usuarios.set(i, usuario);
               return true;
           }
       }
       return false;
    }

    public static void delete(Usuario u){
        usuarios.remove(u);
    }

    public static List<Usuario> readAll(){
        return usuarios;
    }
}
