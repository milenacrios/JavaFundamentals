package ModificadoresDeAcesso.Forma;

public class TesteProtectedMesmoPacote {
    public static void main(String[] args) {
        Forma forma = new Forma();
        forma.lado = 5.5;
        forma.perimetro = 992.2; //no mesmo pacote consigo acessar variáveis protegidas.
        forma.getPerimetro(); //modificador default consigo acessar tranquilamente dentro do mesmo pacote.
    }
}
