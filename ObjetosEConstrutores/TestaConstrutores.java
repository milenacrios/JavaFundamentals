package ObjetosEConstrutores;
class Veiculo {
    double velocidade;
    String marca = "fiat";
}
class Carro extends Veiculo {
    double velocidade;
    String marca;

    double velovidadeDoCarro() {
        //super tbm pode aparecer como atribuição a this
        this.marca = super.marca; //o this nesse caso é opcional mas o super é obrigatório
        return this.velocidade;
    }
    double velocidadeDoVeiculo() {
        return super.velocidade;
    }
}
class Mae {
    long numeroGrande;
    long segundoNumeroGrande;
    Mae() {

    }
    Mae(String s) {
        System.out.println("Mãe");
    }
}
class Filha extends Mae {
    String s; //variável membro da classe
    long segundoNumeroGrande;
    Filha() {
        //por padrão uma classe filha invoca o construtor da classe mãe no seu construtor
        super(); //só posso chamar uma única vez e tem que ser o primeiro argumento do escopo
        //casos em que o super é opcional para acessar variáveis membros da classe mãe:
        numeroGrande = 20;
        super.numeroGrande = 3;
        //o super só não é utilizado para acessar variáveis membros da classe atual
        /**super.segundNumeroGrande = 22;**/ //não compila
        //o compilador reconhece que são variáveis diferentes mesmo sendo de nomes diferentes mas definidas em classes diferentes
        //mas se eu tiro os dois, o compilador não consegue diferenciar a variável membro da classe mãe e altera somente da classe filha
        super.segundoNumeroGrande = 33;
        this.segundoNumeroGrande = 33;

    }
    Filha(int i) {
        this("Número: " + i);
        //posso chamar o outro construtor da classe atual dentro de outro construtor utilizando o this
        System.out.println("Fim do construtor com número");
        s = "milena"; //utilizando a variável membro sem this
        //o this nesse caso é opcional
    }
    Filha(String s) {
        super(s);
        System.out.println(s);
        this.s = s; //nesse caso como temos uma variável local de mesmo nome ocorre o shwdoing
        //para acessar a variável membro é preciso do this.
    }
}
public class TestaConstrutores {
    public static void main(String[] args) {
        new Filha("milena");
        new Filha(32);
        Carro carro = new Carro();
        carro.velocidade = 30; //ele atribuiu essa velocidade na variável do carro ou na de veículo?
        //ele utiliza o tipo de referência para atribuir a velocidade
        //Nesse caso, atribui a Carro
        System.out.println(carro.velovidadeDoCarro());
        System.out.println(carro.velocidadeDoVeiculo());

        //Então eu posso fazer um casting? sim pq carro é um veículo
        ((Veiculo) carro).velocidade = 30;

        System.out.println(carro.velovidadeDoCarro());
        System.out.println(carro.velocidadeDoVeiculo());

    }
}


