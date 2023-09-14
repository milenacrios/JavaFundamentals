package Arrays;

public class TestaArrayMulti {
    public static void main(String[] args) {
        int [][] tabela;
        int[][] cubo[]; //3 dimensões
        int[][][][] hipercubo; //4 dimensões

        tabela = new int[10][5];
        cubo = new int[10][][]; //posso inicializar uma por uma

        int[][] teste  = new int [] []{{1,2,3}, {4,5,6}, {7, 8, 9}};
        for (int i = 0; i < teste.length; i++) {
            System.out.println(teste[i]);
        }
        int[] idades = new int[10];
        //idades[0] = 1.0;


    }
}
