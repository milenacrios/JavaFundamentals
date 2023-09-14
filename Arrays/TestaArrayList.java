package Arrays;

import java.util.ArrayList;

public class TestaArrayList {
    public static void main(String[] args) {
        //as vezes os arrays se tornam limitados uma vez que
        //precisamos definir sua capacidade
        //por exemplo:
        //String[] nomes = new String[10], mas imagine que se nós não subessemos a quantidade máxima?
        //e imagine ainda que eu tenho um novo objeto a adicionar no array. Eu não posso só aumentar a
        //sua capacidade, teria que criar um outro array e copiar tudo para ele mais o novo item
        ArrayList nomes = new ArrayList();
        //a grande vantagem do arraylist é que ele tem um array interno e ele verifica quando a sua capacidade
        //chegou ao seu tamanho máximo, e então cria um novo maior internamente
        //também podemos declarar seu tipo
        ArrayList<String> nomes2 = new ArrayList<>();

        //adicionar items:
        nomes2.add("java");
        nomes2.add("ruby");
        nomes.add("é lindo");
        nomes.add("é turistico");

        //verificar se contem algo
        System.out.println(nomes2.contains("java")); //retorna true ou false

        //excluir items (sempre remove a primeira ocorrência e não todas):
        nomes2.remove("java");
        //verifica se foi excluído:
        boolean removido = nomes2.remove("ruby");
        System.out.println(removido);

        //quantidade de elementos:
        System.out.println(nomes2.size());

        //converter um array list para array (array de object)
        Object[] objects = nomes.toArray();
        //especificar o tipo
        String[] objects1 = nomes2.toArray(new String[nomes2.size()]); //crio um array com o tipo e copio
        //Segunda forma:
        String[] objects2 = nomes2.toArray(new String[0]);

        //unir arraylist:
        ArrayList<String> paises = new ArrayList<>();
        paises.add("Brasil");
        paises.add("Coreia");

        ArrayList<String> tudo = new ArrayList<>();
        tudo.addAll(nomes); //junta arrayslist em um só!
        tudo.addAll(paises);
        System.out.println(tudo);

        //consultar os valores
        System.out.println(nomes.get(0)); //dentro dos () vai a posição desejada

        //Indicar a posição que eu desejo adicionar mais itens
        //nomes.add("tem praia"); se eu deixar assim, o objeto será incluído no final
        nomes.add(0, "tem praia");
        System.out.println(nomes.get(0));

        //removendo pela posição
        //nomes.remove("tem praia"); nesse caso remove passando o objeto mas como remover passando a posição
        nomes.remove(0);
        System.out.println(nomes);


        //atualizar um elemento (trocar por outro)
        nomes.set(0, "sacala"); //o objeto da posição 0 será substituido por scala
        System.out.println(nomes);

        //verificar a posição de um objeto
        System.out.println(nomes.indexOf("é turistico")); //a primeira posição
        System.out.println(nomes.lastIndexOf("é turistico")); //olha de tras pra frente
        //se ele não encontrar o objeto, retorna a posição -1
    }
}
