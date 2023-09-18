package Encapsulamento2;

public class Person {
    //atributos públicos = qualquer outra classe consegue acessar
    //atributor privates = outras classes não conseguem acessar
    //nesse caso, dizemos que os atributos estão compsulados
    private String nome;
    private String sobrenome;
    private String nomeCompleto;
    Person(String nome, String sobrenome) {
        this.nomeCompleto = nome + sobrenome;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    public String getNome() {
        return this.nome;
    }
    public String getSobrenome() {
        return this.sobrenome;
    }
    public String getNomeCompleto(){
        return this.nomeCompleto;
    }
}
