package ModificadoresDeAcesso.Forma;

public class Forma {
    public double lado;
    protected double perimetro;
    private String cor = "azul";
    //essa variável nem é vista por outras classes de outros pacotes ou de mesmo pacote

    public double getArea() {
        return 0;
    }
    double getPerimetro(){
        return 10;
    }

    public void mostraCor() {
        System.out.println(cor);
    }
}
