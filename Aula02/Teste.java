package Aula02;
class Carro {
    int ano;
    char primeiraLetra;
    boolean usado;
    String marca;
    //variáveis membros (atributos da classe) não precisam ser inicializadas e possuem valor default
    // se forem numéricas e char são iguais 0 e se for boolean, seu valor default é false.
    //se for variável de instância ou membro é null;
    //assim como arrays desses tipos
}
public class Teste {
    public static void main(String[] args) {
        char sete = '\u0047'; //posso acessar um caracter de acordo com o código da tabela unicode uftf8
        System.out.println(sete);

        boolean valor = true;

        int idade;
        int Idade;
        int IDADE;
        //java é case sensitive! Lembre-se disso!

        //eu posso indicar as letras: d,l ou f ao final de um valor literal para indicar seu tipo,
        // caso não adicione, o tipo compilado ou é int ou é double
        int x = 15; //seu tipo é int
        double v = 10.2; //seu tipo é double
        float v1 = 10.2F; //seu tipo é float pois adicionei a letra f
        long l = 13L; //seu tipo é long
        int i = 010; //quando o valor vem acompanhado de 0 à esquerda, então esse valor está na base octal
        System.out.println(i);
        int j = 0XA; //valor hexadecimal
        System.out.println(j);
        int l1 = 0B10011;
        System.out.println(l);

        double d2 = 3.1e2; //3*10^2
        System.out.println(d2);

        long x2 = 1_234_567_891_234L; //no java podemos separar as casas decimais com _
        System.out.println(x2); //mas na hora de imprimir fica todos juntos
        idade = 18;
        System.out.println(idade);
        Carro carro = new Carro();
        System.out.println(carro.ano);
        System.out.println(carro.primeiraLetra == 0); //verdadeiro pois char no java é visto como numérico
        System.out.println(carro.usado); //default é false
        System.out.println(carro.marca); //default é nulla
        //variáveis locais precisam ser inicializadas

        for(char c='a';c <= 'z';c++) {
            System.out.println(c);
        }

    }
}

/* Tipos de Dados
* Dados numéricos são:
*   byte;
*   short;
*   char;
*   int;
*   long;
*   float
*   double;
* Double e float são tipos de ponto flutuante e
* byte, short, int, long e char são inteiros
* boolean é o único tipo que não é numérico
* byte representa números -128 à +127
* char é 0 ou +
* */