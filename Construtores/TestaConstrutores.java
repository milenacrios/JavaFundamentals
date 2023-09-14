package Construtores;
class A { //quando crio uma classe sem construtor, por padrão ela tem um construtor vazio sem argumentos
    //esse construtor padrão é equivalente a:
    A() { //nomes de construtores tem que ser exatamente igual ao nome da classe tendo ou não um modificador de acesso.
        super(); //chama o construtor de object
    } //se a minha classe é pública, meu construtor tbm é público
    /**int A(){return 1;}**///deixa de ser um construtor. Construtor não tem retorno
}

class B {
    int i = 15;

    String nome; //primeiro inicializo as variáveis membros para depois chamar o construtor
    /**int tamanho = tamanhoDoNome();**/ //NullPointerException
    //isso por que nome é null e não tem nada na memória ainda
    B(String s) { //no momento que adiciono um construtor, o compilador para de adicionar o construtor padrão
        this.nome = s;
    } //tem o mesmo controle de acesso da sua classe
    //mesmo que eu tenha um construtor definido, posso criar um sem argumentos
    B() { //mas não é o construtor padrão adicionado pelo compilador
        /**new B()**/; //loop infinito. Chama B que chama construtor que chama B que chama construtor...
    }
    int tamanhoDoNome() {
        return nome.length();
    }
}
//mega delicado chamar um método em variáveis membros ou em
//construtores.
public class TestaConstrutores {
    public static void main(String[] args) {
        A a = new A(); //construtor padrão
        B b = new B("milena"); //construtor criado
        System.out.println(b.i);
    }
}
