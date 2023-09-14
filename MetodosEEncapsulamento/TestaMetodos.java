package MetodosEEncapsulamento;
class ClasseComMetodos {

    int getNumero() { //assinatura do método
        //sempre com o tipo do retorno, nome do método e parâmetros a ser recebido
        return 5;
    }
    //tipos de modificadores de acesso antes do método
    //podemos ter o protected, private, public e o dafault
    public int getNumero2() { //public é um modificador de acesso
        return 5;
    }
    //também temos modificadores gerais posso ter vários de uma única vez:
    //nesse caso os modificadores gerais são o final e syncronized
    final synchronized int getNumeros3 () {
        return 4;
    }
    //o final indica que se essa classe for herdada, esse método não podera ser sobrescrito
    //abstract indica que é apenas o contrato do método e não sua implementação (apenas a assinatura)
    //static indica que o método pertence à classe e não ao objeto
    //syncronized o acesso método é sincronizado
    //native também é apenas a assinatura do método assim como o abstract
    //strictfp contas matemáticas deterministicas

    int getNumeros4 () throws RuntimeException{
        //posso indicar quais exceções esse método irá levantar
        return 4;
    }

    int getNumeros5 (final int a, int b) { //posso ter modificadores nos parâmetros
        b = 10;
        //a = 10; //variável final não pode ter seu valor trocado
        return a;
    }
    void primitivo(double a) {
        return; //com o método é void, posso apenas inserir o return sem nada
        //System.out.println(teste); //nunca pode haver nada depois do return
    }
    int getNumeros6() {
        return 4; //nesse caso o return é obrigatório
        //e ele deve retornar um int
    }
    String getNumeros7(int a) {
        if(true) return "verdadeiro";
        //sempre que tenho um if tenho que retornar algo quando a condição for falsa
        //nesse caso, pode ser um outro return ou lançar uma exception
        throw new RuntimeException("Jogando exception resolve o problema");
    }
}
public class TestaMetodos {
    public static void main(String[] args) {

        ClasseComMetodos classeComMetodos = new ClasseComMetodos();
        System.out.println(classeComMetodos.getNumeros7(3));
        //é opcional utilizar o retorno do método
        //nesse caso estamos utilizando em um sout
    }


}
