package DominandoAProva;

public class TestaWrappers {
    public static void main(String[] args) {
        /* Representar primitivos como objetos
        * boolean = Boolean
        * byte = Byte
        * short = Short
        * int = Integer
        * char = Character
        * long = Long
        * double = Double
        * float = Float
        * */
        //versões mais recentes, ta depreciado
        /**Double d1 = new Double(12.33);**/
        //versões mais recentes, a sintaxe é:
        Double d2 = Double.valueOf("22.3");
        Double d3 = Double.valueOf("abc"); //numberFormatError pois não é um número válido para ser convertido
        Double d4 = Double.valueOf("23,7"); //tbm converte ,

        Character c = Character.valueOf('a');

        Boolean b1 = Boolean.valueOf(true); //ou
        Boolean b2 = Boolean.valueOf("true"); //true
        Boolean b3 = Boolean.valueOf("True"); //true
        Boolean b4 = Boolean.valueOf("verdadeiro"); //false
        Boolean b7 = Boolean.valueOf("true "); //false

        //como converter um wrapper para primitivo
        Long l = Long.valueOf("123");
        long l1 = l.longValue(); //long recebe um long wrapper
        int i = l.intValue();
        double d = l.doubleValue();

        boolean b = Boolean.valueOf("T").booleanValue();
        char c1 = Character.valueOf('a').charValue();

        //String => primitivo
        double d20 = Double.parseDouble("123.3");
        int d30 = Integer.parseInt("12");
        int d31 = Integer.parseInt("12", 10); //base 10
        double d32 = Integer.parseInt("2.90", 16); //base hexadecimal
        long d33 = Integer.parseInt("12", 2); //base binária

        //String => wrapper
        //utilizando valueOf
        Double d40 = Double.valueOf("23.0");

        Integer i30 = Integer.valueOf(22);

        //primitivo => String
        //toString
        String d50 = Double.toString(12.90);
        String d51 = Integer.toString(12, 10); //também posso passar a base





    }
}
