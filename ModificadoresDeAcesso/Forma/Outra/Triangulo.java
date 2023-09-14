package ModificadoresDeAcesso.Forma.Outra;

import ModificadoresDeAcesso.Forma.Forma;

public class Triangulo extends Forma {
    //mas eu consigo acessar variáveis protegidas de outros pacotes caso a classe herde da classe mãe dessa variável
    public void imprime() {
        System.out.println("Perimetro = "+perimetro);//this.perimetro
    }
    public void imprime2() {
        /** System.out.println("Perimetro = "+getPerimetro()); **///não consigo acessar modificador padrão fora do pacote
    }
    /**TestaClassePadrao testaClassePadrao = new TestaClassePadra0;**/ //i cant!! somene classes default dentro do mesmo pacote
}
