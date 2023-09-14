package StringBufferEBuilder;

public class TestaStringBufferEBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Caelum");
        //buffer é um espaço para eu colocar uma string dentro
        sb.append(" - ");
        sb.append("Ensino e inovação");
        //posso adicionar e mudar o valor do buffer
        System.out.println(sb);

        StringBuffer sb2 = new StringBuffer(50);
        //nesse caso defino o tamanho máximo do buffer
        System.out.println(sb2);

        StringBuffer sb3 = new StringBuffer(sb);
        //criei um buffer de string baseado no buffer anterior então o já vai vim preenchido com o conteúdo de sb
        sb3.append(" Teste de adicionar");
        System.out.println(sb3);

        //------------------------------------------------------------
        StringBuilder sbui = new StringBuilder("Caelum");
        //buffer é um espaço para eu colocar uma string dentro
        sb.append(" - ");
        sb.append("Ensino e inovação");
        //posso adicionar e mudar o valor do buffer
        System.out.println(sbui);

        StringBuilder sbui2 = new StringBuilder(50);
        //nesse caso defino o tamanho máximo do buffer
        System.out.println(sbui2);

        StringBuilder sbui3 = new StringBuilder(sb);
        //criei um buffer de string baseado no buffer anterior então o já vai vim preenchido com o conteúdo de sb
        sbui3.append(" Teste de adicionar");
        sbui3.append('X');
        sbui3.append(sb);
        System.out.println(sbui3);

        StringBuilder sb4 = new StringBuilder("Caelum - Inovação e Tecnologia ");
        sb4.insert(9, "Ensino e "); //indico a posição que eu quero adicionar uma string
        System.out.println(sb4);
        sb4.delete(6, 15); //deleta tudo que estã entre a posição 6 e a posição 15
        System.out.println(sb4);

        //Reverse:
        System.out.println(new StringBuilder("milena").reverse());

        StringBuilder sb5 = new StringBuilder("Teste - Teste");
        System.out.println(sb5.substring(2, 6)); //nesse caso, não altera o Stirng Builder e, sim, cria uma nova string
        System.out.println(sb5.subSequence(2, 6)); //também retorna uma nova string
        System.out.println(sb5); //StringBuilder permanece igual


        //Como podemos perceber o stringBuffer e o StringBuilder fazem as mesmas coisas, então qual é a diferença?
        //o StringBuffer é threadSafe e o StringBuilder não é.




    }
}
