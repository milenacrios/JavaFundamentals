package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class Cliente3 {
    String nome;
}
public class TestaArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Java");
        nomes.add("Ruby");
        nomes.add("scala");

        Iterator<String> it = nomes.iterator();
        while (it.hasNext()) { //devolve um booleano
            //enquanto tiver próximo, execute:
            String atual = it.next();
            System.out.println(atual);
            //também é possível remover o elemento atual
            it.remove(); //como irá percorrer toda a lista, no final ela será vazia.
        }
        System.out.println(nomes.size());

        for (String nome : nomes) { //mesma opção só que com forEach.
            System.out.println(nome);
        }

        /**
         * Observação importante:
         * Os métodos contains e indexOf de um arrayList dependem do método equals
         * pois basicamente é ele funcionando internamente.
         * Por isso, caso você sobrescreva o método equals como já vimos, pode ser que esses dois métodos
         * tenha seus funcionamentos alterados.
         * **/

        Cliente3 cliente3 = new Cliente3();
        cliente3.nome = "Milena";
        ArrayList<Cliente3> clientes = new ArrayList<>();
        clientes.add(cliente3);
        System.out.println(cliente3.nome);
        System.out.println(clientes.get(0).nome);
        //quando alteramos o valor do objeto, o valor do array list também é alterado
        //Isso porque, ambos são uma referência ao mesmo objeto na memória o Cliente3.nome

        cliente3.nome = "Rios";
        System.out.println(cliente3.nome);
        System.out.println(clientes.get(0).nome);


        ArrayList<String> ss = new ArrayList<String>();
        ss.add("a");
        ss.add("b");
        ss.add("c");
        ss.add("d");

        for (String s : ss) {
            if (s.equals("c")) s = "b";
            else if (s.equals("b")) s = "c";
        }
        for (String s : ss) System.out.println(s);


}
}
