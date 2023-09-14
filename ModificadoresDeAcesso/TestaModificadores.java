package ModificadoresDeAcesso;

public class TestaModificadores {
    public static void main(String[] args) {
        System.out.println(ajsnj.b().b);
    }
}
class ajsnj {
    static int bs=0;
    final int b = ++bs;
    private ajsnj() {}
    static ajsnj b() {
        return new ajsnj ();
    }
}
/**
 * Tipos de Modificadores no java:
 * Public: o mais aberto, acesso livre
 *      classes e interfaces podem ser publicas
 * Protected: qualquer um que herda, dentro do mesmo pacote pode acessar
 * Default (package private - acessado somente dentro do mesmo pacote): padrão. Dentro do mesmo pacote ou dentro dele mesmo para poder acessá-lo
 * Private: apenas dentro do método consegue acesar (mais restrito de todos)
 *      membros da classe: variáveis, construtores e métodos podem ter todos os tipos
 *
 *
 * **/