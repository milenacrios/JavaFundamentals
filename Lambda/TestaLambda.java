package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Pessoa {
    String nome;
    int idade;
    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public String toString() {
        return nome;
    }
}
@FunctionalInterface
interface Matcher<T> { //interface funcional
    //interfaces funcionais só podem ter um único método definido
    boolean test(T t);
}
class MaioresDeIdade implements Predicate<Pessoa> {
    public boolean test(Pessoa pessoa) {
        return pessoa.idade >= 18;
    }
}

class FiltradorDePessoas {
    List<Pessoa> filtra(List<Pessoa> todas, Predicate<Pessoa> matcher) {
        List<Pessoa> resultado = new ArrayList<>();
        for (Pessoa pessoa : todas) {
            if (matcher.test(pessoa)) {
                resultado.add(pessoa);
            }
        }
        return resultado;
    }
}
interface Printer{
    void printMessage();
}
public class TestaLambda {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(new Pessoa("Milena", 31),
                new Pessoa("Milena", 32),
                new Pessoa("Guilherme", 12),
                new Pessoa("Mario", 8),
                new Pessoa("Alex", 39));
        FiltradorDePessoas filtradorDePessoas = new FiltradorDePessoas();

        //lambda: (parametros) -> { codigo }
        Predicate<Pessoa> criterio2 = (Pessoa p) -> {
            return p.idade >= 18;
        };
        //forma mais reduzida:
        Predicate<Pessoa> criterio3 = p -> p.idade >= 18;

        //isso é uma classe anônima:
        Predicate<Pessoa> criterio = new Predicate<Pessoa>() {
            //existem algumas classes funcionais já prontas no java
            //é o caso da classe Predicate
            public boolean test(Pessoa pessoa) {
                return pessoa.idade >= 18;
            }
        };
        List<Pessoa> resultado = filtradorDePessoas.filtra(pessoas, criterio);
        List<Pessoa> resultado2 = filtradorDePessoas.filtra(pessoas, criterio2);
        List<Pessoa> resultado3 = filtradorDePessoas.filtra(pessoas, criterio3);
        //forma ainda mais simplificada:
        List<Pessoa> resultado4 = filtradorDePessoas.filtra(pessoas, pessoa -> pessoa.idade >= 18);
        System.out.println(resultado);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);


        //Regras do lambda
        //lambdas pode ter vários parâmetros
        /*
        * (String s1, String s2) -> {codigo}
        *
        * */

    }

}
