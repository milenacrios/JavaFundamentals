package Aula01;

public class Aula03 {
    int soma(int a, int b) {
        return a + b;
    }
    public  static void main(String[] args) { //quando executado, nenhuma instância é criada ainda e ele roda!
        System.out.println("Rodando meu programa java");
        Aula03 a = new Aula03();
        a.soma(1, 2); //perceba que o método soma só roda com uma instância da classe criada
    }
}

//Padrõa de nomenclatura de pasta
//Diretório -> br -> com -> nome da empresa -> nome do projeto
