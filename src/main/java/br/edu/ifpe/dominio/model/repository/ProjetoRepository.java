package br.edu.ifpe.dominio.model.repository;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpe.dominio.model.Projeto;
import br.edu.ifpe.dominio.model.Usuario;

public class ProjetoRepository {

private static List<Projeto> projetos = new ArrayList<>();
    
    public static void create(Projeto p){
    	projetos.add(p);
    }
    
    public static Projeto read(String  titulo){
    	for(Projeto projeto : projetos){
            if(projeto.getTitulo().equals(titulo)){
                return projeto;
            }
        }
        return null;
    }
    
    public static List<Projeto> readAll(){
    	return projetos;
    }
    
    public static void delete(Projeto p) {
    	projetos.remove(p);
    }
    
    public static boolean update(Projeto projeto){
        for(int i = 0; i < projetos.size(); i++){
           if(projetos.get(i).getTitulo().equals(projeto.getTitulo())){
        	   projetos.set(i, projeto);
               return true;
           }
       }
       return false;
    }
}
