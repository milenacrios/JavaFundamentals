package Arrays;

public class TestaArray2 {
    public static void main(String[] args) {
        Cliente1[] clientes = new Cliente1[10]; //array de referência
        //System.out.println(clientes[0].nome);
        //toda vez que criamos um array, as posições são inicializadas com um valor default do mesmo tipo
        //no caso de arrays de referências, todas as posições são definidas com "null"
        //e ai, esse sout da uma exception pois ele não consegue acessar null.
        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = new Cliente1();
            clientes[i].nome = "Milena";
        }
        for (Cliente1 c : clientes) {
            System.out.println(c.nome);
        }
        Cliente1 clientes2[] = new Cliente1[5];
        clientes2[0] = new Cliente1();
        clientes2[1] = new ClienteEspecial();
        //em arrays de referência, podemos colocar subtipos daquele tipo dentro também

        Cliente1 milena = new Cliente1();
        milena.nome = "milena";
        clientes2[0] = milena;
        System.out.println(milena.nome);
        System.out.println(clientes2[0].nome);
        milena.nome = "rios"; //quando altero o atributo do objeto, o array também é modificado
        System.out.println(milena.nome);
        System.out.println(clientes2[0].nome);


        int[] valores = new int[10];
        //long numeros[] = valores; não é possível fazer cast em arrays de tipos diferentes

        String[] nomes = {"Milena", "Mario", "Guilherme"};
        Object[] objects;
        objects = nomes;
        //porém, quando o array é de referência, eu consigo fazer um cast desde que os tipos
        //sejam compatíveis, como é o caso de string e object, uma vez que string é um object

        for (Object o : objects) {
            System.out.println(o);
        }

        int x[] = new int[3];
        for(x[1]=x.length-1;x[1]>=0;x[1]--) {
            x[x[1]]=-5;
            System.out.println(x[1]);
        }





    }
}

class Cliente1 {
    String nome;
}

class ClienteEspecial extends Cliente1 {

}
