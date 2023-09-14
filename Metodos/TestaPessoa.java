package Metodos;

public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNomeEIdade("Milena", 22);
        String nome = p.getNomeEIdade();
        System.out.println(p.getNomeEIdade());
        System.out.println(nome);
    }
}
