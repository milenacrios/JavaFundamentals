package Operadores;

public class TestaOperadoresArtimeticos {
    public static void main(String[] args) {
        int dois = 2;
        int dez = 10;

        int doze = dez + dois;
        int oito = dez - dois;
        int vinte = dez * 2;
        int cinco = dez / dois;
        int restoDaDivisaoDeCincoPorDois = 5 % 2;

        //Operações aritméticas retornam no mínimo um int e no máximo o maior entre os valores da operação
        //se for um int + um long entao o retorno da soma é um long

        byte num1 = 2;
        byte num2 = 10;
        //byte soma = num1 + num2; o mínimo sempre é um int e int não cabe em byte

        //int divisao1 = 5/0; não existe (erro de execução)
        double divisao2 = 5/0.0; //mas divisão de ponto flutuante por 0.0 funciona
        System.out.println(divisao2);

    }
}
