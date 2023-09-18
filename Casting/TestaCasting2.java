package Casting;
//Quando a utilização do Casting é necessária?
interface Automatico {}
class Veiculo {}
class Moto extends Veiculo {}
final class Caminhao extends Veiculo {}
class Carro extends Veiculo {}
class CarroAutomatico extends Carro implements Automatico {}
public class TestaCasting2 {
    public static void main(String[] args) {
        Object[] objects = new Object[100];
        String s = "certificacao";
        objects[0] = s;
        //estamos fazendo o objeto objects referenciar à uma string

        //eu sei então que o objeto na posição 0 é uma string
        //mas o compilador não sabe, ele sabe apenas o tipo da referência
        //que nesse caso é um object e não string
        /**String recuperada = objects[0];**/ //por isso essa linha não compila.
        //nem t odo object é string, mas toda string é um object!

        String recuperada = (String) objects[0]; //eu estou falando pro compilador que ele deve reconhecer o objecto como string (cast)

        Veiculo veiculo = new Carro(); //t odo carro é um veiculo
        /**Moto moto = v;**/ //não compila pois nem t odo veiculo é uma moto
        //Então nesse caso eu posso fazer um casting?
        /**Moto moto = (Moto) veiculo;**/ //o compilador até aceita, mas em tempo de execução ele laança uma exception
        //isso porque a JVM tenta chamar o veiculo de moto
        //mas o que veiculo referencia? um carro, que não tem relação com moto

        String milena = (String) "milena"; //faz sentido usar casting nesse caso?
        //não pq a referência e objeto são strings, mas funciona

        CarroAutomatico carro3 = new CarroAutomatico();
        Automatico a = carro3; //t odo CarroAutomatico é automatico
        Carro carro4 = carro3; //t odo CarroAutomatico é um carro
        /**Automatico automatico = carro4;**/ //porém nem t odo Carro é automático
        //não compila. Posso fazer casting?
        Automatico automatico = (Automatico) carro4; //sim porque pode ser que haja uma classe filha de Carro que implementa Automatico
        //Carro tem poder para implementar Automatico

        Moto moto2 = new Moto();
        /**Automatico automatico1 = moto2;**/ //Moto não implementa automatico
        //não compila. Então eu posso fazer um Casting? Não pois moto2 não implementa Automatico.
        //Até compila, mas em tempo de execução a JVM não reconheceria a herança de Automatico para moto e
        //lançaria uma exception.
        //O compilador permite pq pode ser que no futuro haja uma moto que implemente a interface
        //mas em tempo de execução acaba descobrindo que não tem


        Caminhao caminhao = new Caminhao();
        /**Automatico automatico1 = (Automatico) caminhao;**/ //Não é possível fazer casting em classes finais
        //isso pq classes finais não podem ser herdadas
        //se ela não implementou a interface (Automatico) até agora, ela nunca mais vai implementar


        //saber se uma classe é uma instância de uma interface
        Carro carro = new Carro();
        carro = carro3;
        if (carro instanceof Automatico) {
            System.out.println("É automático");
        }
    }
}







