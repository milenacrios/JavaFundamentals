package ComparacaoDeObjetos;

public class TestaComparacaoStrings3 {
    public static void main(String[] args) {
        String texto = "um texto qualquer";
        String txt = texto.substring(3,8);
        //como strings são imutáveis, ao chamar um método um novo objeto string é criado e, portanto
        //não será armazenado no pool e consequentemente, é diferente do literal
        System.out.println(txt == "texto");

        System.out.println(texto.toLowerCase() == texto);
        //no caso do exemplo acima, o texto já está em mínusculo, o java reconhece isso e não aplica
        //portanto ele verifica que é o mesmo e da igual ao original

        System.out.println(texto.toString() == texto);
        //o texto já é string então não altera o comportamento do string e portanto é igual ao original


    }
}
