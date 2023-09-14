package ReferenciaEPrimitivo;
class Prova {
    int tempo;
}
public class TestaReferenciaEPrimitivo {
    static int[] s(int[] i) {
        int[] j = {i[0], i[1]};
        i[1]++;
        return j;
    }
    public static void main(String[] args) {
        int i = 2; //aqui é uma variável local
        teste(i);
        //caso eu queira que o i daqui seja alterado pelo método teste:
        i = teste(i); //alterando o tipo de retorno para int do método teste
        //nesse caso passa a ser modificado pelo retorno do método
        //o conteúdo de i vai ser copiado para a variável local definida como parâmetro do método teste

        Prova prova = new Prova(); //ao executar essa linha:
        //um espaço na memória é criado para a variável prova
        //e um espaço na memória é criado para o objeto Prova()
        prova.tempo = 100; //aqui eu altero o valor da variável no objeto Prova
        teste(prova); //chamo o método passando a referência da variável prova que é Prova e tempo foi alterado para 100.
        System.out.println(prova.tempo); //ainda é a variável local de main mas que ta apontando para a mesma referência da variávle local de teste onde o tempo é igual a 210.
        teste2(prova);
        System.out.println(prova.tempo);
    }
    static void teste2 (Prova prova) {
        prova = new Prova(); //nesse caso ele aponta para um novo objeto
        prova.tempo = 520;
    }
    static void teste(Prova prova){ //reservo um novo espaço na memória para variável prova
        prova.tempo = 210; //altero o valor do objeto referenciado por prova para 210.
    } //quando finalizo o método a variável pode gabarge coletada pq não perdeu a referência
    static int teste(int i) { //i nesse caso é outra variável local
        //assim, tem 2 espaços na memória: o i do método main e o i do método teste
        i = 5; //i aqui é a variável local do método e não a que foi enviada!
        System.out.println(i); //imprimo o i que na vdd é um valor copiado do outro i que foi passado como parâmetro
        //ao finalizar o método, retira da pilha e as variáveis locais podem ser gabarge coletadas
        return i;
    }

}
