package com.opet;

import com.opet.util.Reader;

public class Aula4_Fatorial
{

    public static void main(String[] args) throws Exception
    {
        // TODO Auto-generated method stub
        int numeroAnterior = 0;
        int soma = 0;

        System.out.print("Insira um número:");
        int numeroUsuario = Reader.readInt();
        for(int i=numeroUsuario; i>0; i--) {
            numeroAnterior = numeroUsuario-(numeroUsuario-i)-1;
            System.out.println(numeroUsuario+" * "+
              numeroAnterior+": "+(numeroUsuario*numeroAnterior));
            soma=soma+(numeroUsuario*numeroAnterior);
        }
        System.out.println("Fatorial de "+numeroUsuario+" é "+soma);
    }

}
