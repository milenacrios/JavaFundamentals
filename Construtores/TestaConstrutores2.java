package Construtores;
class Livro {
    //não posso ter 2 construtores com a mesma assinatura
    //o que vai mudar é a quantidade e tipos de argumentos
    Livro (String... s) { //construtor recebe var args
        System.out.println("com string");
    }
    Livro(int i) {
        //posso chamar construtor dentro de outro construtor
        this(); //chamei o construtor sem argumentos
        //o this tem que ser o primeiro passo dentro do método construtor
        //e só posso ter um this.
        System.out.println("construtor com int");
    }
    Livro() {
        System.out.println("Sem argumentos");
    }
    Livro(double b) {
        //posso chamar um outro construtor e dentro dele chamar um método estático
        this(valor()); //valor é um método estático
        System.out.println("com double");
    }
    static String valor() { //o this só recebe métodos estáticos
        return "xpto";
    }
}


public class TestaConstrutores2 {

    public static void main(String[] args) {
        Livro livro = new Livro("milena", "milena pt2");
        Livro l = new Livro(); //o var args definido aceita qualquer coisa (em string) inclusive nada
        //mas caso haja um construtor sem argumentos definido na classe
        //ao criar um objeto e não passar nada, ele procura o construtor mais específico que é o sem argumentos
        //mesmo que varargs aceita tudo inclusive nada
        Livro livroComInt = new Livro(23); //construtor com int que chama construtor sem argumentos no seu escopo
        Livro livroComDouble = new Livro(1.3);
    }
}
