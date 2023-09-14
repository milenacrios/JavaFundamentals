package Casting;

public class TestaCasting {
    public static void main(String[] args) {
        double d = 15.3;
        //ind i = d; //não compila porque vou perder informação
        //System.out.println(i);
        //mas eu posso forçar o compilador a aceitar um valor de tipo diferente:
        int i = (int) d; //deixando somente a parte inteira
        System.out.println(i);

        long l = 15151515151515L;
        int i2 = (int) l;
        System.out.println(i2);

        int x = 200;
        byte x2 = (byte) x;
        System.out.println(x2);

        long aa = 0; double bn = 0;
        double zero = aa + bn;
        System.out.println(zero);

        int $$ = 5;
        int __ = $$++;
        System.out.println($$);
        System.out.println(__);

        


    }
}
