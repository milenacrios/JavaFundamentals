package diferenca_entre_variaveis;
class ObjetoMeu{
    int valor;
}
public class TesteReferencia {
    public static  void main(String[] args) {
        ObjetoMeu o1 = new ObjetoMeu();
        o1.valor = 10;
        ObjetoMeu o3 = new ObjetoMeu();

        ObjetoMeu o2 = o1; //não estou criando um novo objeto do tipo ObjetoMeu
        System.out.println(o1.valor);
        System.out.println(o2.valor);
        //Duas referências são consideradas iguais somente se elas estão apontando para o mesmo objeto.
        //Mesmo que o objeto que elas apontem sejam iguais, ainda são referências para objetos diferentes

        o1.valor = o1.valor + 5;
        //quando é variável de instância. O valor passa a mudar nas duas referências.

        System.out.println(o1.valor);
        System.out.println(o2.valor);

        int a = 10;
        int b = a;

        a = a + 5; //a vai ser diferente de b por que ao usar = eu to copiando o primeiro valor para b
        System.out.println(a);
        System.out.println(b);
    }
}
