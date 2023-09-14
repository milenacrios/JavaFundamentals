package MetodosEEncapsulamento;
class Moto {
    String marca;
    public static final int PADRAO_TOTAL_DE_MOTOS = 8; //variáveis finais por padrão no java tendem a ser maiuscula
    public static int totalDeMotos3 = PADRAO_TOTAL_DE_MOTOS; //variáveis staticas podem receber outras variáveis staticas apenas!
    /** public int totalDeMotos; **/
    //total de motos é um número que toda moto tem?
    //toda moto tem um total de motos? não.
    //então não pode ser uma variável membro! Ou seja, uma variável do objeto
    //pq nesse caso, a cada vez que um objeto fosse criado, essa variável iria ser diferente para cada um


    //solução:
    public static int totalDeMotos; //tornar a variável como variável da classe

    //os modificadores de acesso poderão ser modificados também em uma variável estática
    public static int totalDeMotos2; //nesse caso, não consigo acessar fora da classe
    //a solução é criar um método get:
    //e como esse é um método normal, pertencente ao objeto
    //para acessar na classe main, eu preciso criar uma instância dessa classe
    //e por isso não faz sentido, portanto o método tbm deverá ser estático
    public static int getTotalDeMotos2() {
        /**marca = "Honda";*/ //regra geral: coisas estáticas dentro de coisas estáticas
        //não posso acessar variáveis membros em métodos estáticos
        return Moto.totalDeMotos2;
    }

}
public class TestaStatic {
    public static void main(String[] args) {
        /**Moto.marca = "Honda"**/ //Faz sentido? nesse caso não, por que marca será diferente para cada moto
        //todas as motos são da mesma marca? não
        Moto.totalDeMotos = 15;
        System.out.println(Moto.totalDeMotos);
        //para acessar uma variável estática, eu preciso acessar a partir da classe
        //para acessar um método get de uma variável estática privada:
        /**Moto moto = new Moto();
        System.out.println(moto.getTotalDeMotos2());*/ //não faz sentido!
        Moto.totalDeMotos2 = 10; //mas ai a variável privada não consigo acessar, vamos mudar para pública.
        System.out.println(Moto.getTotalDeMotos2());
        Moto moto = new Moto();
        //moto.totalDeMotos um objeto não acessa variável estática
        System.out.println(moto.getTotalDeMotos2());
        //mas consegue acessar métodos estáticos
        //mas ele chama na classe e nunca do objeto
        //é como se o compilador verificasse qual classe que esse objeto está referenciado e
        //trocasse esse objeto pela classe, modificando o sout para:
        //System.out.println(Moto.getTotalDeMotos2()); isso em tempo de compilação!

    }



}
