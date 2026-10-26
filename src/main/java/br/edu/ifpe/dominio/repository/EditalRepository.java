package br.edu.ifpe.dominio.repository;

import br.edu.ifpe.dominio.model.Edital;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class EditalRepository {

    private final List<Edital> editais = new ArrayList<>();

    public Edital save(Edital edital)
    {
        if (edital == null)
        {
            throw new IllegalArgumentException("Edital não pode ser nulo.");
        }
        editais.add(edital);
        return edital;
    }

    public List<Edital> findAll()
    {
        return new ArrayList<>(editais);
    }

    public Optional<Edital> findByNumeroAndAno(int numero, int ano)
    {
        return editais.stream()
                .filter(e -> e.getNumero() == numero && e.getAno() == ano)
                .findFirst();
    }

    public boolean delete(Edital edital)
    {
        return editais.remove(edital);
    }


    public boolean deleteByNumeroAndAno(int numero, int ano)
    {
        return editais.removeIf(e -> e.getNumero() == numero && e.getAno() == ano);
    }

    public int count()
    {
        return editais.size();
    }

    public void clear()
    {
        editais.clear();
    }
}