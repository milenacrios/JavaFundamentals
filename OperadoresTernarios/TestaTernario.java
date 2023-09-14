package OperadoresTernarios;

public class TestaTernario {
    public static void main(String[] args) {
        //(condicao) ? caso_verdadeira : caso_falsa
        int i = 5;
        int resultado = (i == 5) ? 100 : 0;
        //caso o i seja igual a 5, atribua a 100, caso não seja, atribua a 0
        System.out.println(resultado);
        Object resultado2 = (i == 5 ? "100" : 0);
        System.out.println(resultado2);
    }
}
