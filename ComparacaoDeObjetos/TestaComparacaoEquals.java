package ComparacaoDeObjetos;
class Cliente {
    String nome;
    public Cliente(String nome) {
        this.nome = nome;
    }
    public boolean equals(Object o) { //sobrescrevendo método equals
        Cliente outro = (Cliente) o;
        return this.nome.equals(outro.nome);
    }
}
public class TestaComparacaoEquals {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Milena");
        Cliente c2 = new Cliente("Mario");
        Cliente c3 = new Cliente("Mario");
        //o operador == tem o objetivo de verificar se estão apontando para o mesmo objeto
        System.out.println(c1 == c2);
        System.out.println(c1 == c1);
        //apesar de c2 ser igual a c3, são objetos diferentes
        System.out.println(c2 == c3);
        //para comparar conteudos:
        //mas por default, ele compara referência, igual o ==
        //System.out.println(c2.equals(c3));
        //adicionar o critério tem que sobreescrever o método
        System.out.println(c2.equals(c3));

        String s1 = "s1";
        String s2 = s1.substring(0, 1) + s1.substring(1,1);
        System.out.println(s1==s2);

    }
}
