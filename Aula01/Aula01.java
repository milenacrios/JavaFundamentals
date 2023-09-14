package Aula01;

public class Aula01 {
    String name = "MilenaRios"; //variável de instância, cujo é acessada dentro dos métodos da classe
    String apelido = name + " mila";
    static int id = 1; //existe uma única apra todos os objetos da classe
    //pode ser acessada também em todos os escopos da classe
    static void metodoEstaticoAcessaVariavelEstatica() {
        System.out.println(id);
    }
    public void m1() {
        System.out.println(apelido);
        System.out.println(id);
        int x = 10;
        System.out.println(x);
        if(x >= 10) {
            int y = 50; //variavel local, ou seja, só é acessa dentro do escopo do if
            System.out.println(y);
        }
        for(int i=0, j=0; i<=10;i++)j++;
        //variável i e j são locais e acessiveis somente no escopo do for
        //System.out.println(y);
    }

    public void m2(String nome) {
        System.out.println(nome);
        System.out.println(name);
        System.out.println(id);
        //parâmetros também são variáveis locais, acessiveis somente no escopo do método
    }

    public Aula01 (String name) {
        System.out.println(id);
        System.out.println(name);
        //esse é um construtor que recebe o mesmo nome da classe
        //a variável só é acessada nesse escopo
        System.out.println(name); //name é variável do objeto instanciado
    }
    public static void main(String[] args) {
        Aula01 a = new Aula01("Milena");
        System.out.println(id);
        Aula01 aluno = new Aula01("Milena");
        a.m1();
        a.m2("Milena");
        System.out.println(a.name); //consigo acessar a variável de instância (atributo) pelo objeto

    }
}

//variáveis locais são acessadas somente no escopo em que elas foram definidas
