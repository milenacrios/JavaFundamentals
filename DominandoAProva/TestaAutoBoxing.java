package DominandoAProva;

public class TestaAutoBoxing {
    static long i;
    public static void main(String[] args) {
        Integer intWrapper = Integer.valueOf(1); //cria um wrapper int
        //operações em wrapper
        //preciso converter pra primitivo, fazer a operação e converter para wrapper novamente
        int intPrimitivo = intWrapper.intValue();
        intPrimitivo++;
        intWrapper = Integer.valueOf(intPrimitivo);

        //custoso!
        //surge nova solução: AutoBoxing
        Integer intWrapper2 = Integer.valueOf(1);
        intWrapper2++; //convertendo e desconvertendo automaticamente pelo compilador
        //por baixo dos panos é a primeira solução


    }
}


