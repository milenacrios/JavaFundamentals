package Polimorfismo;

import java.io.FileNotFoundException;
import java.io.IOException;

//O conceito de reescrita de um método consiste em herdar uma classe e sobrescrever o comportamento de um método da classe mãe
class Automovel {
    public void liga() { //o acesso do método sempre tem que ser menor ou igual do acesso do método sobrescrito
        //o método da mãe não pode ser final
        System.out.println("O veículo está sendo ligado");
    }
}
class Helicoptero extends Automovel {
    //sabemos que quando uma classe herda de outra
    //essa classe conterá todos os atributos e membros da classe mãe
    //O polimorfismo é o ato de sobrescrever esses métodos, mudando seu comportamento específico para essa classe filha
    //significa então que terei esse método definido novamente na classe filha:
    public void liga() { //precisa ser exatamente igual a assinatura original
        System.out.println("Ligando o Helicoptero");
        //em tempo de execução o java verifica se os métodos foram sobrescritos para executar devidamente

    }
}
abstract class Droid extends Automovel {
    public abstract void liga();
    //um método que já foi definido numa classe pai
    //pode ser reescrito na classe filha como abstrato
    //Isso é válido quando temos vários níveis de abstração
    //nesse caso, temos automóvel e temos droid e temos hexadroid
}
class HexaDroid extends Droid {
    public void liga() {
        System.out.println("HexaDroid ligando!");
    }
}
class FabricaDeVeiculo {
   Automovel fabrica() {
       return new Automovel();
   }
}
class FabricaDeHexaDroid extends FabricaDeVeiculo{
    HexaDroid fabrica() {
        return new HexaDroid(); //o tipo de retorno precisa ser compatível com o retorno do método pai.
    //nesse caso HexaDroid é um tipo mais específico, visto que é um Automóvel e assim é compatíel com o método pai.
    }
}
class D {
    public void metodo() {
        System.out.println("a");
        /**this.metodo2();**/
        //com o this.metodo2() ele chama o método do objeto que é o que herda dessa classe e pos isso entra em loop
    }
    /**public void metodo2(){
        System.out.println("metodo 2 do pai");
    }**/
}

class E extends D {
    public void metodo() {
        System.out.println("b");
        super.metodo(); //chamando o método da superclasse (classe mãe)
    }
    public void metodo2() {
        System.out.println("c");
        metodo(); //esse método será o da classe mãe ou da subclasse? subclasse
        //método do próprio objeto
        super.metodo();
    }

    public static void main(String[] args) {
        new E().metodo2();
    }
}
interface A {
    void x();
    //to do método de interface é por padrão público e abstrato
}
class B implements A {
    /**void x(){
     * //então a implementação do método de uma interface não pode ser package default
    } **/
    public void x(){
        //isso pq t odo método de interface é público
    }
}
class TestaPolimorfismo {
    static void metodo(Automovel automovel) {
        //método polimorfico é um método que recebe um tipo de objeto e todos os seus filhos
        automovel.liga();
    }
    public static void main(String[] args) {
        Helicoptero helicoptero = new Helicoptero();
        helicoptero.liga();

        //nesse caso, o compilador sabe que objetos do tipo Automovel possuem um método liga
        //mas em tempo de execução ele verifica se a variável que está apontando pra qual objeto e se nesse objeto possui o método liga
        Automovel automovel = new Helicoptero();
        automovel.liga();

        Automovel automovel1 = new FabricaDeVeiculo().fabrica();
        HexaDroid automovel2 = new FabricaDeHexaDroid().fabrica();

        metodo(new HexaDroid()); //o método espera um automóvel mas tbm pode receber um mais específico. Isso é herança!
        //HexaDroid tbm é um automóvel
        metodo(new Automovel()); //assim como o geral funciona
        metodo(new Helicoptero());
    }
}



