package Lacos;

public class TestaDoWhile {
    public static void main(String[] args) {
        int j = 20;
        do { //primeiro executa, depois verifica a condição
            //o bloco é executado pelo menos 1 vez
            //chaves opcionais caso só tenha uma instrução no bloco
            System.out.println(j);
            j++;
        } while (j < 10);
        int i = 0;
        do; while(i++<10);

    }
}
