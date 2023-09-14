package Lacos;

public class TestaLacos {
    public static void main(String[] args) {
        //int i = 0;
       // while (i < 10) {
            //i++;
            //if (i == 5)
                //break; //quebra o laço mais próximo em um dado momento (quando i = 5)
            //System.out.println("i = "+ i);
        //}
       // System.out.println("break funcionou");
    //}
    int j = 0;
    while (j < 10) {
        j++;
        if (j == 5)
            continue; //volta para o início do laço
        System.out.println("i = "+ j);
    }
        System.out.println("break funcionou");

    for (int k = 1; k < 10; k++ ) {
        if (k == 8) break;
        if (k == 5) continue;
        System.out.println(k);
    }

    externo: for (int y = 1; y < 10; y++) { //consigo nomear o laço para indicar o break;
        tabuada: System.out.println("tabuada do "+y); //posso nomear e dar um break? posso nomear, mas não break
        interno: for (int w = 1; w < 10; w++) { //não faz muito sentido nomear o mais próximo
        //por default, o break quebraria nele.
            if (y * w == 25) break externo; //nesse caso ele quebra o laço indicado
            System.out.println(y + " * " + w + " = " + y*w);
        }
    }
    for (int u = 0; u < 4; u++) {
        System.out.println("estou antes do switch");
        switch (u) {
            case 0:
            case 1:
                System.out.println("caso: "+u);
                break;
            case 2:
                System.out.println("Legal "+u);
                continue; //procura o laço mais próximo que é o for nesse caso
            case 3:
                System.out.println("Cheguei no 3");
                break;
            default:
                System.out.println("Estranho");
                break;
        }
        System.out.println("estou após o switch");
    }


}
}
