package Excecoes;

import java.io.IOException;

public class TestaExcecoes2 {
    public static void main(String[] args) {
        String nome = null;
        //usamos try catch quando a exception é do tipo runtime ou throwable
        try { //tente executar isso e segura o erro caso surgir, não deixe vazar
            nome.toLowerCase();//não encontra a string para aplicar o método
            System.out.println("Essa linha não roda pois ele tenta o método acima e procura o catch em seguida");
        } catch (Exception exception) { //muda o fluxo do programa
            //não posso colocar uma exception diferente no catch, tem que ser a que ocorre.
            //o programa passa no catch se encontrar a mesma exception
            //caso o programador não saiba, pode utilizar a classe geral de excption unchecked: RunTimeException
            //pois existe polimorfismo.
            //ou ainda uma maneira mais geral é Excption
            //Então, pode ser do mais específico para a classe mãe: NullPointerException -> RuntimeExcpetion -> Excption -> Throwable
            //uma herda da outra!
            System.out.println("peguei a excpetion");
        }

        System.out.println("terminei"); //quebra antes, a exception de cima estourou
        //surge o cenário de utilização do try, uma vez que ele facilita a execução do restante do código mesmo se encontrar uma exception.
    }
}
class A {
    public static void main(String[] args) {
        String nome = null;
        try {
            nome.toLowerCase();
            System.out.print("a");
        } catch(NullPointerException ex) {
            System.out.print("b");
        } finally {
            System.out.print("c");
        }
        System.out.println("d");
    }
}
