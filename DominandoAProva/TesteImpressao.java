package DominandoAProva;

public class TesteImpressao {
    public String toString() {
        return "a";
    }
    public static void main(String[] args) {
        System.out.print(1); //sem pular linha
        System.out.print("a \n"); //pula linha
        System.out.println(2); //pula linha
        System.out.println(new TesteImpressao());
        //converte o conteúdo do objeto para string com o método toString
        //se eu quero imprimir outra coisa, preciso sobrescrever o toString

        char[] letras = {'a', 'b'};
        System.out.println(letras);
        //único objeto que não executa o método toString é um array de char

        int[] numeros = new int[2];
        numeros[0] = 123;
        numeros[1] = 9;
        System.out.println(numeros);
        //até mesmo um array de inteiros, executa o toString e o seu conteúdo representa o endereço na memória

        //formata a impressão
        System.out.printf("Hello %s, Have a nice day!\n", "Milena");
        //% (interpolação) representa tipo do parâmetro que deseja incluir
        System.out.printf("Oi, você tem %d anos?%n", 22); //%n tbm quebra linha

        System.out.format("foo%n");
        System.out.printf("%2$s %1$s", "World", "Hello");
        //definindo a ordem dos parâmetros passados

        System.out.format("[%5d]%n", 42);
        //definindo o tamanho de caracteres

        System.out.format("[%+5d]%n", 42);
        //o + indica que sempre que o número for positivo ele vem com sinal positivo
        System.out.format("[%+5d]%n", -90);

        System.out.format("[%-5d]%n", -90); //alinhar à esquerda
        System.out.format("[%05d]%n", 18);
        //se for números,adiciona 0 à esquerda

        System.out.format("[%,f]%n", 181020304050.09);
        //caso o número seja muito grande, separar com ,

        System.out.format("[%.2ff]%n", 181020304050.09212);
        //imprima apenas com 2 casas decimais

        System.out.println(new char[]{'a','b','c'}); // A
        System.out.println(new byte[]{'a','b','c'}); // B
        System.out.println("abc"); // C
        System.out.println(new String[]{"abc"}); // D


    }
}
