package ClassesAbstratasEInterfaces;

abstract class B1 {
    void x() {
        System.out.println(y());
    }
    Object y() { return "a"; }
}
abstract class C1 extends B1 {
    abstract String y();
}
class D extends C1 {
    String y() { return "b"; }
}
class A1 {
    public static void main(String[] args) {
        D d  = (D) (C) new D();
        d.x();
    }
}
public class TestaExerciico {
}
