package OperadoresTernarios;

public class TestaOperadorDeReferência {
    public static void main(String[] args) {
        String nome = "milena";
        int tamanho = nome.length(); //o . é um operador de referência
        System.out.println(tamanho);
    }
}
