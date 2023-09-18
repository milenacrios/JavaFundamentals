package Excecoes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
//criando a minha própria exception:

class AcessoAoArquivo {
    //Essa primeira linha estoura uma exception pois não existe o arquivo.
    //Mas eu não posso tratar minha exception fora de um método
    //por isso preciso criar o construtor que vai incializar as variáveis
    //e nem tratar as exceções
    InputStream is = new FileInputStream("a.txt");
    AcessoAoArquivo() throws FileNotFoundException {

    }
}
class SaldosInsuficiente extends Exception {
    SaldosInsuficiente(String msg) {
        super(msg); //chamo o construtor de Exception
    }
}
class ContaDoBem {
    double saldo = 100;
    void saca(double quantidade) {
        if (this.saldo < quantidade) {
            //throw new IllegalArgumentException("Saldo insuficiente" + saldo + " para sacar");
            //joga uma exception
            /**throw new java.io.IOException("Saldo insuficiente" + saldo + " para sacar");**/ //exceção inválida
            //não compila pq é uma checked exception e por isso precisa de try catch

        }
        this.saldo -= quantidade;
    }
}
class ContaDoMal {
    double saldo = 100;
    void saca(double quantidade) throws IOException { //to falando pro meu méto tratar a exceção
        if (this.saldo < quantidade) {
            throw new IOException("Saldo insuficiente" + saldo + " para sacar");
        }
        saldo -= quantidade;
    }
}
class ContaUsandoExceptionCriada {
    double saldo = 100;
    void saca(double quantidade) throws SaldosInsuficiente {
        if (this.saldo < quantidade) {
            throw new SaldosInsuficiente("Saldo insuficiente " + saldo + " para sacar");
        }
        saldo -= quantidade;
    }
}
class TestaExceptionCriada {
    public static void metodo1() {
        try {
            new ContaUsandoExceptionCriada().saca(300);
        } catch (SaldosInsuficiente saldosInsuficiente) {
            System.out.println("tratei a exception criada");
        } //é possível ter mais de um catch, o compilador seleciona o adequado de acordo com a exception estourada
        catch (NullPointerException exception) {
            System.out.println("catch inadequado");
        }
    }
    public static void main(String[] args) {
        metodo1();
    }
}
class TestaTrataException {
    public static void metodo1 () {
        new ContaDoBem().saca(500);
        try {
            new ContaDoMal().saca(400);
        } catch (IOException exception) {
            System.out.println("tratei a exception");
        }
    }
    public static void main(String[] args) {
        metodo1();
    }
}
public class TestaExcecoes3 {
    public static void metodo1() {
        System.out.println("primeiro antes");
        try {
            metodo2();
            System.out.println("primeiro depois");
        } catch (NullPointerException exception) {
            System.out.println("tratei a exception");
        }
        System.out.println("fim do método 1");


    }
    public static void metodo2 () {
        String s = null;
        System.out.println("segundo antes");
        s.length();
        System.out.println("segundo depois");
    }
    public static void main(String[] args) {
        metodo1();

    }
}
