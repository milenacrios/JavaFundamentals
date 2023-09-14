package Encapsulamento;
//encapsulamento consiste na ideia de de esconder o funcionamento de certas funções
//apenas liberar o acesso para quem precisa
public class Pessoa {
    String nome;//variável membro com acesso package private
    //isso pode ser perigoso, uma vez que qualquer um aqui dentro pode modificar esse atributo
    //encapsular = esconder como funciona as coisas
    //Então, como outra pessoa vai acessar a variável nome?
    //Através de um método e assim, ela não vai saber como estou entregando esse nome a ela
    private String nome2;
    public String getNome() {
        return nome2;
    }
    //assim como posso tbm disponibilizar um método de alteração dessa variável: o set
    public void setNome(String nome) {
        this.nome2 = nome;
    }

    //Resumindo:
    //Encapsular é:
    //Esconder as variáveis usand private e liberar acesso com métodos públicos (getters e setters)

}

class B{
    private final int b;
    B(int b) { this.b = b;}
    public int getB() { return b; }
    public void setB(int b) { b= b; }
}
class A {
    public static void main(String[] args) {
        B b = new B(10);
        b.setB(5);
        System.out.println(b.getB());
    }
}
