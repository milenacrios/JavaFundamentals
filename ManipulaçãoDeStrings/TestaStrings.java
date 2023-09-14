package ManipulaçãoDeStrings;

public class TestaStrings {
    public static void main(String[] args) {
        //maneiras de criar uma string
        String nomeDireto = "Java";
        String nomeIndireto = new String("Java");
        char[] nome = new char[]{'K', 'a', 'u'};
        String nome1 = new String(nome);

        StringBuilder sb1 = new StringBuilder("Java");
        String nome2 = new String( sb1);

        //se uma String é referência a um objeto, então ela tbm pode aceitar valor nullo
        String nomeNulo = null;

        //Concatenação de Strings
        String nomeDaProva = "Certificação" + " " + "Java";
        String nomeDaProvaComNulo = nomeDaProva + " " + nomeNulo;
        System.out.println(nomeDaProvaComNulo); //é possível concaternar strings com null

        System.out.println("Certificação " + 1500);

        //Strings são mutáveis
        String s = "caelum";
        s.toUpperCase();
        //continua minusculo pq depois que a string foi criada, ela não muda
        System.out.println(s);

        //Solução
        s = s.toUpperCase(); //atribua a alteração à string
        System.out.println(s);

        System.out.println(s.charAt(0));
        //String é nada mais que um array, por isso para acessar um caracter em uma dada posição, basta acessar a posição
        System.out.println(s.charAt(3));
        //System.out.println(s.charAt(-1)); //exception

        //tamanho da string
        System.out.println(s.length());

        //verifica se a string é vazia
        System.out.println("".isEmpty()); //isEmpty retorna true ou false
        System.out.println("   ".isEmpty()); //espaços em branco não são vazios

        //Método trim para remover espaços
        System.out.println("     João    ".trim());

        //replace
        System.out.println(s.replace('A', 'E')); //troca de char
        System.out.println(s.replace("CAE", "ALU"));

        //tirar um pedaço de string
        String java = "Java";
        System.out.println(java.substring(1, 3));

        //Comparação de strings
        System.out.println("Java".equals("java"));
        System.out.println("Java".equalsIgnoreCase("java")); //ignora as letras maiusculas

        //verifica a ordem alfabética de quem vem antes ou depois
        System.out.println("Certificado".compareTo("Arnaldo")); //retorna positivo se o que eu to comparando vier depois
        System.out.println("Certificado".compareTo("Certificado")); //retorna 0 pq são iguais
        System.out.println("Certificado".compareTo("certificado"));
        System.out.println("Certificado".compareToIgnoreCase("certificado"));
        System.out.println("Certificado".compareTo("Grécia")); //retorna negativo pq Grécia vem depois dele

        String texto = "Pretendo fazer a prova de certificação de Java";
        System.out.println(texto.indexOf("Pretendo")); //me fala a posição da primeira ocorrência da string pretendo (0)
        System.out.println(texto.indexOf("prova"));
        System.out.println(texto.indexOf("pretendia")); //retorna -1 se a palavra não existe
        System.out.println(texto.lastIndexOf("a")); //procura de tras pra frente
        System.out.println(texto.indexOf("e", 10)); //procure a letra e a partir da posição 10
        System.out.println(texto.lastIndexOf("a", 10)); //procure a letra até a posição 10
        System.out.println(texto.startsWith("Pretendia")); //retorna true se a string começa com essa palavra
        System.out.println(texto.startsWith("Pretendo")); //nesse caso retorna true
        System.out.println(texto.endsWith("Pretendia")); //verifica se a string termina com essa palavras


        StringBuilder sb = new StringBuilder("guilherme");
        System.out.println(sb.indexOf("e") + sb.lastIndexOf("e"));
        System.out.println(sb.indexOf("k") + sb.lastIndexOf("k"));
    }
}
