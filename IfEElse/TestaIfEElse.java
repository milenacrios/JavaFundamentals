package IfEElse;

public class TestaIfEElse {
    public static void main(String[] args) {
        boolean autentico = true;
        if (autentico) {
            System.out.println("Ok");
        } else {
            System.out.println("Não autorizado");
        }
        int a = 0, b = 3;
        if (a == b) {
            System.out.println("iguais");
        }

        //se for uma única instrução dentro do if, não precisa de chaves
        boolean v = true;
        if (v)
            System.out.println("true");
        else if(!v)
            System.out.println("false");


    }
}
