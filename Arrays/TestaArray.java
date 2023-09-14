package Arrays;
class Cliente {

}
public class TestaArray {
    public static void main(String[] args) {
        //formas de criar um array
        int[] idades;
        double pesos[];
        long []numeros;

        //formas de inicializar um array:
        int[] idades1 = new int[10]; //entre colchetes é sua capacidade
        //para cada posição de 0 a 10, carrega um valor default conforme seu tipo
        System.out.println(idades1[4]);

        //quando já sei todos os valores
        int[] idades2 = new int[]{1, 54, 22, 19}; //ou
        int [] idades3 = {2, 49, 13, 22}; //ou
        int [] idades4;
        idades4 = new int[]{0, 92, 18, 33};

        Cliente[] clientes = new Cliente[]{new Cliente(), null, new Cliente()};
        //um array de referência

        //percorrendo um array
        System.out.println("Tamanho do array"+idades2.length);
        for (int i = 0; i < idades2.length; i++) {
            System.out.println(idades2[i]);
        }
        //forEach:
        System.out.println("Forma melhor de percorrer um array");
        for (int idade : idades2) {
            System.out.println(idade);
        }


    }
}
