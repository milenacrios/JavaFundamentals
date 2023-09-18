package Encapsulamento2;

public class Teste {
    public static void main(String[] args) {
        Person person = new Person("Milena", "Rios");
        //imprima o nome completo da pessoa
        System.out.println(person.getNome() + " " + person.getSobrenome());
        //segunda maneira
        System.out.println(person.getNomeCompleto());
        //Qual a melhor forma?
        //a primeira forma implica em que possíveis mudanças futuras irão modificar o comportamento do nome

    }
}
