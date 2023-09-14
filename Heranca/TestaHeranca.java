package Heranca;
import java.io.*;
import Acesso_A_Variaveis.Carro;

class Mae { //por padrão extende object e por isso suas subclasses tbm herdam de object
    //ou seja, em java todas as classes herdam de object

}
class Filha extends Mae { //classe filha herda da classe mae
//só é possível herdar de uma única classe
}
class Neta  extends Filha { //indiretamente neta herda de mae

}

class Avenida extends Endereco {
    //o construtor da classe mãe precisa estar acessível
    //a classe endereço não tem o construtor definido, logo
    //por padrão é um construtor vazio
    //Assim, o construtor da classe Avenida por padrão tbm é:
    Avenida(){ //por padrão t o do construtor padrão chama o construtor padrão da classe pai
        //não precisa desse escopo, o java naturalmente define
        super();
    }
}
class X {
    int x;
    public void y() {
        System.out.println("Invocando y em um objeto");
    }
}
class Y extends X {

}

class W {
    public static void metodo() {
        System.out.println("Invocando um método estático definido em W");
    }
    /**abstract static void x();**/ //não existe método estático abstrato, tome cuidado!
}
class Z extends W {
    public static void metodo() { //não houve erança do método em w. Esse é um método único de w
        System.out.println("Invocando um método estático definido em Z");
    }
}
class Gato {
    String corDosOlhos;
    //é comum sobrescrevermos o método toString de Object
    public String toString() {
        return "Gato " + corDosOlhos;
    }
}
public class TestaHeranca {
    public static void main(String[] args) {
        //se todas as classes do java herdam de Object, então...
        //eu posso utilizar todos os métodos definidos em object
        Gato g = new Gato();
        g.corDosOlhos = "mel";
        System.out.println(g.toString()); //toString é um método de Object
        //toString devolve o tipo do objeto e o endereço na memória


        Y y = new Y(); //y acessa o que tem em x
        y.x = 13; //x foi definido em X mas y tem acesso pq ele herda de X
        y.y(); //da mesma forma o método y.

        W.metodo();
        Z.metodo(); //consigo acessar um método estático ou seja, referenciá-lo mas não consigo modificá-lo

        //O bind da invocação de um método é feito em tempo de compilação
        //Isso quer dizer que se eu tiver um objeto z
        //e chamar o método estático, ele vai utilizar a referência para invocar o método
        Z z = new Z();
        z.metodo();

        W w = new W();
        w.metodo();

        //através do polimorfismo, eu posso:
        //chamar um objeto do tipo z de w
        W w2 = new Z();
        w2.metodo();
    }
}






class B {
    protected String s = "a";
    protected B() {}
    static A B(String s) {
        return new A(s);
    }
}
class A extends B {
    A(String s) {
        this.s = s;
    }
    public static void main(String[] args) {
        A b = A.B("t");
        System.out.println(b.s);
    }
}