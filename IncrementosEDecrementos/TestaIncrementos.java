package IncrementosEDecrementos;

public class TestaIncrementos {
    public static void main(String[] args) {
        int i = 5;
        i--; //decrementa 1 no valor de i
        System.out.println(i);
        System.out.println(i--); //primeiro ele mostra o valor e depois decremente mas...
        System.out.println(--i); //primeiro ele decrementa o valor e depois ele mostra
        i++;

        int j = 5;
        j += 2; //incrementa 2 ao j
        j -= 2; //decrementa 2 ao j
        j *= 5; //multiplica por 5
        j /= 10; //divide por 10
        j *= 100;
        j %= 3;
        System.out.println("valor de j: "+j);
        System.out.println(i);

        byte b = 15;
        b += 3; //nesse caso funciona
        //b = b + 3; //nesse caso ele reconhece o 3 como int e não aceita pq int n cabe em byte
    }
}
