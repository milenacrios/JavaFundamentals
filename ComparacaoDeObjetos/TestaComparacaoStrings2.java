package ComparacaoDeObjetos;

public class TestaComparacaoStrings2 {
    public static void main(String[] args) {
        String ab = "a" + "b";
        //Duas strings literais, o resultado é um literal e também será colocado no pool de strings
        //assim comparando literais, são iguais
        System.out.println(ab == "ab");

        String a2 = "a";
        String ab2 = a2 + "b";
        //nesse caso é a concatenação de um não literal com um literal que da em um não literal e
        //por isso ab2 não vai parar no pool de strings o que faz a comparação abaixa ser falsa.
        System.out.println(ab == "ab");
    }
}
