package Metodos;
class Calculadora {
    public int soma (int... numeros) {
        //o método soma recebe uma quantidade variável de argumentos (int... numeros)
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        return soma;
    }
    void x (int... X) {
        System.out.println(X.length);
    }
}
public class TestaCalculadora {
    public  static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.soma(2, 4)); //posso enviar 2 argumentos
        System.out.println(calculadora.soma(1, 4, 59, 2)); //como também posso enviar mais de 2 argumentos
        System.out.println(calculadora.soma()); //ou 0 argumentos
        calculadora.x();
    }
}
