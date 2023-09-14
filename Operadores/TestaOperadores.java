package Operadores;

public class TestaOperadores {
    public static void main(String[] args) {
        int idade = 22;
        //tipos primitivos ocupam um espaço fixo na memória.
        //byte -> short -> int -> long
        //char -> int -> long
        //float -> double
        //Tamanhos inteitos
        //1 byte: 8bits e aceita valores entre -128 a 127
        //1 short equivale a 2 bytes e aceita valores entre -32.768 a 32.767
        //1 int equivale a 4 bytes e varia de -2.147.483.648 a 2.147.483.647
        //1 long equivale a 8 bytes e varia de -9.2223.372.036.854.775.808 a -9.2223.372.036.854.775.807
        byte idade1 = 20;
        short idade2 = 20;
        int idade3 = 20;
        long idade4 = 20;
        //char são inteiros de acordo com a codificação na tabela ASCII/unicode
        char caracter = 36;
        System.out.println(caracter);

        //Tamanhos com ponto flutuante
        //float equivale a 4 bytes
        //double equivale a 8 bytes (mais utilizado)
        float saldo1 = 100.30f; //precisa do f no final
        double saldo2 = 100.30;


        int a = 10;      // tipos iguais
        long b = 20;     // int cabe em um long
        float c = 10f;  // tipos iguais
        double d = 20.0f; // float cabe em um double
        double e = 30.0; // tipos iguais
        //float f = 40.0; // erro, double não cabe em um float.
        //int g = 10l; // erro, long não cabe em int
        float h = 10l; // inteiros cabem em decimais
        double i = 20; // inteiros cabem em decimais
        //long j = 20f; // decimais não cabem em inteiros

    }
}
