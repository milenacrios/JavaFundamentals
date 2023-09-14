package Operadores;

public class TestaOperadoresLogicos {
    public static void main(String[] args) {
        System.out.println(1 == 1 & 1 > 2);
        System.out.println(1 ==1 | 1> 2);
        System.out.println(1 == 1 ^ 1 > 2);
        System.out.println(!(1 == 1));
        //quando basta verificar um lado (short circuite):
        System.out.println(1 == 1 && 1 > 2);
        System.out.println(1 == 1 || 1 > 2);
        //se o primeiro é true, ele bloqueia a compilação da segunda condição
        //short circuit sempre compila o primeiro lado da condição
    }
}
