package IfEElse;

public class UnreacheableCode {
    public int metodo() {
        return 5;
        //System.out.println("oi"); //o return deve finalizar o método

    }
    public int metodo2 (int x) {
        if(x>200) {
            return 10; //só retorna se a condição for válida e não pode
        }
        throw new RuntimeException();
    }
}
