package ModificadoresDeAcesso.Forma.Outra;

import ModificadoresDeAcesso.Forma.Forma;


public class TesteOutroPacote {
    public static void main(String[] args) {
        Forma forma = new Forma();
        //Forma pode ser acessado por todos e inclusive de outros pacotes
        //isso porque seu modificador de acesso é público.
        //Assim como as variáveis e métodos membros da classe Forma
        //todos eles foram definidos como públicos
        //Abra o arquivo forma.java
        forma.lado = 5.5;
        /**forma.perimetro = 8.2;**/ //perimetro é uma variável protected. Não consigo acessar.
        //não é possível acessar variáveis protectds de outro pacote.

        forma.getArea();

        /**Quadrado quadrado = new Quadrado(); *////erro! não posso acessar nenhuma classe default fora do pacote.
        forma.mostraCor();
    }
}
