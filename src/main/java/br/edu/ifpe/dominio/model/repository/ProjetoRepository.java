package br.edu.ifpe.dominio.model.repository;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpe.dominio.model.Projeto;
import br.edu.ifpe.dominio.model.Usuario;

public class ProjetoRepository {


	private static List<Projeto> projetos = new ArrayList<>();
	private static int countId = 0;
    
    public static void create(Projeto p){
    	p.setId(countId);
    	projetos.add(p);
    	countId ++ ;
    }
    
    public static Projeto read(Integer id){
    	for(Projeto projeto : projetos){
            if(projeto.getId().equals(id)){
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
    
    public static boolean update(int id, Projeto novosDados) {

        for (int i = 0; i < projetos.size(); i++) {

            Projeto projetoAtual = projetos.get(i);

            if (projetoAtual.getId() == id) {

                projetoAtual.setTitulo(novosDados.getTitulo());
                projetoAtual.setResumo(novosDados.getResumo());
                projetoAtual.setPalavrasChave(novosDados.getPalavrasChave());
                projetoAtual.setPublicoAlvo(novosDados.getPublicoAlvo());
                projetoAtual.setAreaTematica(novosDados.getAreaTematica());
                projetoAtual.setCampus(novosDados.getCampus());
                projetoAtual.setOds(novosDados.getOds());

                return true;
            }
        }

        return false;
    }
}
