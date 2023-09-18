package Excecoes;

import java.util.ArrayList;
import java.util.Date;
class BlocoEstatico {
    static { //é carregada assim que a classe é instanciada
        String s = null;
        s.length();
    }
}
class NovaConta {
    double saldo = 100;
    public void saca(double valor) {
        if (saldo < valor) {
            throw new IllegalArgumentException();
        }
        saldo -= valor;
    }
}

class Tarefa {
    boolean rodando = false;
    void start() {
        if (rodando) {
            throw new IllegalStateException();
        }
        rodando = true;
    }
    void stop() {
        rodando = false;
    }
}
public class TestaExceptions4 {
    public static void main(String[] args) {
        //primeiro tipo de exceção: ArrayIndexOutOfBoundsException
        int[] x = new int[23];
        /**x[39] = 12;**/ //ocorre quando tentamos acessar uma posição que não existe

        //Segundo tipo de exceção: IndexOutOfBoundsException
        ArrayList<String> list = new ArrayList<>();
        list.add("milena");
        list.add("milena2");
        /**list.get(3);**/ //acessando indice que não existe de uma lista

        //terceiro tipo de exceção: NullPointerException
        String s = null;
        /**s.length();**/ //acessar um método sobre uma referência nula


        //quarto tipo de exceção: ClassCastException
        Object o = "milena";
        /**Date date = (Date) o;**/ //tipos incompatíveis

        //quinto tipo de exceção: NumberFormatException
        String numero1 = "1a";
        /**int um = Integer.parseInt(numero1);**/ //tentando converter um número em string que não é válido.

        //sexto tipo de exceção:IllegalArgumentException
        /**new NovaConta().saca(400);**/ //quando os valores não correspondem ao que esperavamos
        //normalmente nós que invocamos essa exceção.

        //setimo tipo de exceção:IllegalStateException
        Tarefa t = new Tarefa();
        /**t.start();**/ //o estado já é true
        /**t.start();**/ //true
        /**t.start();**///true, o objeto ainda não ta no estado esperado

        //oitavo tipo de ERROR: ExceptionInInitializerError
        /**new BlocoEstatico();**/ //quando carrega uma classe com bloco estático e ele estoura uma exception


        //nono tipo de Exception:StackOverflowError
        //ocorre quando há um loop e a pilha acaba enchendo de processes
        /**new TestaExceptions4().metodo();**/


        //décimo tipo de exception: OutOfMemoryError
        //memória insuficiente
        boolean sempre = true;
        ArrayList<String> strings = new ArrayList<>();
        String inicial = "milena";
        while (sempre) {
            /**inicial += "milena";**/
            /**strings.add(inicial);**/

        }
    }
    void metodo() {
        metodo();
    }
}



