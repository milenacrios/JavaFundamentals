package ComparacaoDeObjetos;

import java.awt.*;

public class TestaComparacaoStrings {
    public static void main(String[] args) {
        String nome1 = "Milena";
        String nome2 = "Milena";
        //quando duas strings são iguais, o que acontece é que o java cria um pool com o nome "milena"
        //e na segunda vez ele simplesmente aponta pro mesmo objeto já criado anteriormente e, por isso
        //quando damos o sout abaixo, ele retorna verdadeiro pq estamos comparando duas referências iguais
        //ou seja duas referências a um único objeto na memória
        //mas isso só funciona com o  valor literal, se tiver o new ele verifica se já tem referência na memória

        System.out.println(nome1 == nome2);

        String nome3 = new String("Milena");
        System.out.println(nome1 == nome3);
        //o new faz o java verificar se já tinha objeto string na memória

        System.out.println(nome1.equals(nome3)); //essa é a maneira mais correta de comparar strings.

    }
}
