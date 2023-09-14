package SwitchCase;

public class TestaSwitch {
    public static void main(String[] args) {

        int opcao = 4;
        switch (opcao) {
            case 1:
                System.out.println("Primeira opção");
                break;
            case 2:
                System.out.println("Segunda opção");
                break;
            case 3:
                System.out.println("Terceira opção");
                break;
            case 4: //posso ter um case vazio
            default:
                System.out.println("default");
        }
    }
}
