package ComparacaoDeObjetos;

public class ContandoStrings {
    public static void main(String[] args) {
        String h = new String("hello ");
        //nessa linha de cima, nós temos 2 objetos criados:
        //toda vez que uso o new String, crio um objeto string
        //mas toda vez que eu escrevo um literal, também crio um objeto string
        //mas apenas o literal vai para o pool
        String h1 = "hello ";
        //nenhum objeto é criado pois já existe um objeto igual no pool e aqui apenas faz a mesma referência
        String w = "world";
        //é criado um novo objeto e colocado no pool de strings
        System.out.println("hello "); //nenhum objeto é criado pois já tem no pool, apenas faz uma referência
        System.out.println(h1 + "world"); //novo objeto sem ir ao pool de strings
        System.out.println("Hello " == h1); //cria um novo literal no pool "Hello "
    }
}
