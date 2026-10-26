package br.edu.ifpe.dominio.utils;

import java.time.LocalDate;

public class ValidadorEdital {

    public static boolean validadorIntervaloDatas(LocalDate dataInicio, LocalDate dataFim)
    {
        return dataInicio != null && dataFim != null && !dataInicio.isAfter(dataFim);
    }
}
