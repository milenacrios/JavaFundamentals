package Acesso_A_Variaveis;
class Carros {
    Carro c1;
    Carro c2;
}
public class TestaCicloDeVida {
    public static void main(String[] args) {
        Carro c = new Carro();
        Carros carros = new Carros();
        //para criar um objeto, é preciso chamar o construtor
        c.ano = 2022;
        c.modelo = "Siena";
        //enquanto tenho uma referência a um objeto na memória, esse objeto (carro) se torna acessível
        carros.c1 = c;
        //nesse caso, temos uma referência indireta e por isso não podem ser deletados da memória porque c1 depende de c.

        c = new Carro(); //nova referência, o outro perdeu a referência
        //o antigo objeto referenciado anteriormente passa a ser inacessível e esse é um novo objeto
        c.modelo = "Gol";
        c.ano = 2010;
        carros.c2 = c;

        c = null; //nesse momento, temos 2 objetos inacessíveis

        if(15 > 10) {
            Carro c2 = new Carro();
            c2.ano = 2018;
            //nesse caso, a variável que referencia o objeto carro (c2) é uma variável local e, portanto:
            //torna o objeto acessível somente no bloco em que ele é referenciado. Nesse caso, o if.
        }
        Carro c3;
        for (int i = 0; i < 10; i++) {
            c3 = new Carro();
        }
        //Nesse caso, a variável de referência (c3) é criada antes do bloco for e por isso, quando o loop é finalizado
        //c3 guarda somente a última referência, ou seja, o décimo carro.
        //portanto nesse momento, tem um único objeto acessível.

        //quando um objeto se torna inacessível é possível que seja removido da memória com o guabarge colector a partir disso
        //mas não sabemos quando.
    }
}
