package Metodos;

public class Pessoa {
    String nome;
    int idade;
    public String getNomeEIdade() {
        return nome + idade;
    }

    public void setNomeEIdade(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprime() {
        getNomeEIdade();
    }
}
