package Aula01;

interface A {
    final int TAMANHO = 5;
    void autentica(String nome, String senha);
    //em interfaces, por padrão, recebem variáveis estáticas e métodos abstratos
    //lembre-se, interfaces são contratos
    //sempre são públicos
}

public class Aula02 {
    String nome;
    static int teste = 1;
    //uma variável estática ou variável de classe só é acessada pela classe e não pelo objeto
    //são variáveis que não guardam valores ou referências para uma determinada instância, mas sim um valor compartilhado por todas as instâncias de objetos.
     Aula02(String nome) {
        this.nome = nome;

    }
    public String getName() {
        return nome + "Rios";


    }
    public static void main(String[] args) {
        Aula02 a = new Aula02("milena");
        System.out.println(a.nome);
        System.out.println(Aula02.teste);
        System.out.println(a.getName());
    }
}
