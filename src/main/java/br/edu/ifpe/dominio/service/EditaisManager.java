package br.edu.ifpe.dominio.service;

import br.edu.ifpe.dominio.model.Edital;
import br.edu.ifpe.dominio.repository.EditalRepository;
import br.edu.ifpe.dominio.utils.ValidadorEdital;

import java.util.List;
import java.util.Optional;


public class EditaisManager
{

    private final EditalRepository repository;

    public EditaisManager()
    {
        this(new EditalRepository());
    }

    public EditaisManager(EditalRepository repository)
    {
        if (repository == null) {
            throw new IllegalArgumentException("Repositório não pode ser nulo.");
        }
        this.repository = repository;
    }

    public Edital cadastrar(Edital edital)
    {
        if (edital == null) {
            throw new IllegalArgumentException("Edital não pode ser nulo.");
        }

        validarIntervalo(
                "submissão",
                edital.getDataInicioSubmissao(),
                edital.getDataFimSubmissao()
        );
        validarIntervalo(
                "avaliação",
                edital.getDataInicioAvaliacao(),
                edital.getDataFimAvaliacao()
        );

        return repository.save(edital);
    }

    public List<Edital> listar()
    {
        return repository.findAll();
    }


    public Optional<Edital> buscar(int numero, int ano)
    {
        return repository.findByNumeroAndAno(numero, ano);
    }

    public boolean remover(int numero, int ano)
    {
        return repository.deleteByNumeroAndAno(numero, ano);
    }

    public int total()
    {
        return repository.count();
    }

    public void limpar()
    {
        repository.clear();
    }


    private void validarIntervalo(String nomeIntervalo, java.time.LocalDate inicio, java.time.LocalDate fim)
    {
        if (!ValidadorEdital.validadorIntervaloDatas(inicio, fim))
        {
            throw new IllegalArgumentException(
                    "Intervalo de datas de " + nomeIntervalo + " inválido. " +
                    "A data de início deve ser anterior ou igual à data de fim, e ambas não podem ser nulas."
            );
        }
    }
}

