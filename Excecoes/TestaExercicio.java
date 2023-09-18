package Excecoes;
import java.io.*;

import static java.lang.System.*;


class MyException extends RuntimeException {

}
class A1 {
    void m2() throws java.io.FileNotFoundException {
        System.out.println("e");
        boolean sim = true;
        if(sim) throw new MyException();
        System.out.println("f");
    }
    void m() throws java.io.FileNotFoundException {
        System.out.println("c");
        try {
            m2();
        } catch(java.io.FileNotFoundException ex) {
        }
        System.out.println("d");
    }
    public static void main(String[] args) throws
            java.io.IOException {
        System.out.println("a"); //a c e
        new A1().m();
        System.out.println("b");
    }
}
public class TestaExercicio {
    public static void main(String[] args) {

    }
}
