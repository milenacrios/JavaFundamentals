package ReferenciaAObjeto;
import java.util.ArrayList;
import java.util.List;

//Diferença de uma referência de um tipo de um objeto
class Conta {
    int id;
}
class ContaJuridica extends Conta {
    String cnpj;

}

public class TestaTipoDeReferenciaEObjeto {
    public static void main(String[] args) {
        //Os dois casos abaixo eu estou utilizando o polimorfismo para
        //dizer que eu vou referenciar uma ContaJuridica como se fosse uma conta e
        //referenciar um ArrayList como se fosse uma list.
        Conta conta = new ContaJuridica();
        //como ContaJuridica herda de Conta, então o tipo da minha variável pode ser Conta.
        List list = new ArrayList<>();
        //da mesma forma que eu posso fazer um ArrayList ser do tipo list

        //Esse é o detalhe mais importante:
        //Eu só consigo acessar variáveis membros que estejam definidas no meu tipo de Referência
        conta.id = 15;
        /**conta.cnpj = "01920";**/ //cnpj não está contido no tipo de referência que é Conta

        /**ContaJuridica d = conta;**/ //isso não é possível
        //uma vez que o tipo de conta é Conta e o tipo de d é ContaJuridica e por isso não são compatíveis.
    }
}
