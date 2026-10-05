package br.edu.ifpe.dominio.utils;

public class ValidadorUsuario
{
    public static boolean verificadorCPF(String cpf)
    {
        int j = Character.getNumericValue(cpf.charAt(9));
        int k = Character.getNumericValue(cpf.charAt(10));

        int aux = 0;
        for(int i = 9; i > 0 ; i--)
        {
            aux += Character.getNumericValue(cpf.charAt(i-1)) * i + 1;
        }

        aux = aux % 11;

        if(((aux == 0)||(aux == 1)) && j !=0)
        {
            return false;
        }
        else if ((aux > 1) && (j != 11 - aux))
        {
            return false;
        }

        aux = 0;

        for(int i = 10; i > 0 ; i--)
        {
            aux += Character.getNumericValue(cpf.charAt(i-1)) * i + 1;
        }

        aux = aux % 11;

        if(((aux == 0)||(aux == 1)) && k !=0)
        {
            return false;
        }
        else if ((aux > 1) && (k != 11 - aux))
        {
            return false;
        }

        return true;

    }
}
