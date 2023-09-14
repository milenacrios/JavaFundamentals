package MetodosSobrecarregados;
class Overloader {
    //sobrecarga de métodos é quando existem dois métodos com nomes iguais mas
    // com números ou tipos de parâmetros diferentes.
    public void metodo(int a) {
        System.out.println("com int");
    }
    public void metodo() {
        System.out.println("sem nada");
    }
    public void metodo(double a) {
        System.out.println("com double");
    }
    public void metodo2(String s) {
        System.out.println("com string");
    }
    public void metodo2(Object s) {
        System.out.println("com object");
    }
    //esses dois métodos são sobrecargar também mesmo alterando a ordem dos parâmetros.
    public void metodo3(String a, int b) {
        System.out.println("String -> int");
    }
    public void metodo3(int b, String a) {
        System.out.println("Int -> String");
    }
    //ambos são sobrecarregados, mas preste atenção no main!
    public void metodo4(int a, double b) {
        System.out.println("int -> doble");
    }
    public void metodo4(double b, int a) {
        System.out.println("double -> int");
    }
    //ambos métodos sobre carregados, mas String não é Object?
    public void metodo5(String a, Object b) {
        System.out.println("String -> Object");
    }
    public void metodo5(Object b, String a) {
        System.out.println("Object -> String");
    }
}

public class TestaOverload {
    public static void main(String[] args) {
        new Overloader().metodo2("milena");
        //sabendo que toda string é um object. Qual método ele irá chamar?
        //ele chama o método que recebe uma string ou o que recebe o com o object
        //a resposta é que ele chama aquele que for mais específico para o tipo passado.
        //nesse caso, ele chama o método com string.
        //caso eu queira especificar qual método eu quero chamar:
        new Overloader().metodo2((Object) "milena"); //nese caso, eu especifico que quero chamar o método com object.

        new Overloader().metodo4(1, 5.2); //ele chama o método double int
        new Overloader().metodo4(5.3, 1); //ele chama o método int double
        //mas e se os valores de a e b forem 3, 4?
        //os dois casos são numéricos
        //compilador quebra e eu devo explicitar qual método eu quero
        /**new Overloader().metodo4(3, 4);**/

        //compilador tbm quebra pq causa ambiguidade
        /**new Overloader().metodo5("milena", "ana julia");**/
        //preciso especificar:


    }

}
