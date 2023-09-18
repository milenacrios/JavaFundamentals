package ClassesAbstratasEInterfaces;
abstract class SemMetodo {
    //é possível criar uma classe abstrata sem método
    //também é possível ter metodos sem serem abstratos em uma classe abstrata
    //0 ou + métodos abstratos.
}
abstract class ComMetodoAbstrato {
    //se a classe vai ter métodos abstratos então ela precisa ser abstrato
    abstract void executa(); //um método abstrato é apenas sua assinatura, sem corpo
}

abstract class Veiculo {
    abstract void liga();
}
abstract class Carro extends Veiculo { //uma classe que herda de uma classe abstra tbm precisa ser abstrata
    //isso pq não tem os métodos implementados
}
class Carro2 extends Veiculo {
    void liga() { //implemento método, então é concreta

    }
}
abstract class CarroAutomatico extends Carro2 { //não posso instanciar
    abstract void liga();
    //mesmo tendo sido implementado em Carro2, eu to dizendo que quem herdar CarroAutomatico precisa implementar o método liga novamente.

}
class CarroAutomaticoBonito extends CarroAutomatico {
    void liga() {
        System.out.println("implementando o método de liga definido em CarroAutomatico");
    }
}

//se eu tenho uma classe com apenas um método, essa poderá ser uma interface
//Qual a diferença de classe abstrata para Interface?
//A classe abstrata pode ter métodos normais e abstratos
//Na interface, t odo método é abstrato, não podendo ser implementado
//Na interface não é possível ter métodos estáticos até o java 7
interface Conta {
    void saque(); //a palavra abstract é opcional.
    /**void transfere() {}**/ //não pode ter método concreto!
    static void deposito() {
    //no caso do java8, é possível ter métodos estáticos
    }
}
class Poupanca implements Conta, Runnable { //preciso obrigatoriamente implementar os métodos da interface
    //posso implementar quantas interfaces eu quiser.
    public void saque() {
        System.out.println("Sacando da poupança");
    }
    public void run() { //método da interface Runnable

    }
}
//Eu posso ter herança entre interfaces? sim, veja:
interface A {
    int X = 10; //posso ter constantes nas minhas interfaces
    //por padrão são públicas, estáticas e final, não precisando escrever public static
    //por isso, por padrão é escrito em maiusculo
}
interface B extends A{ //interface herda somente de outra interface

}
interface C extends B, A, Runnable { //uma interface pode herdar de mais de uma interface

}
class TestaAbstractEInterface {
    public static void main(String[] args) {
        //uma classe abstrata não pode ser instanciada sem ser herdada
        //preciso ter uma classe que herda a classe abstrata e ai eu instancio essa classe
        //isso pq se é uma classe concreta, é preciso ter a implementação dos métodos
        /**new SemMetodo();**/ //não compila
        /**new ComMetodoAbstrato();**/ //não compila
    }
}
public class TestaClasseAbstrata {
    public static void main(String[] args) {
        /**System.out.println(new A().X);**/ //interface não pode dar new
    }
}
