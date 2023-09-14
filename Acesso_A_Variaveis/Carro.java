package Acesso_A_Variaveis;

public class Carro {

    String modelo;
    int ano;

    Carro() {
        ano = 2014;
    }
    void Reseta () {
        ano = 2014;
        //o this significa que o acesso é ao atributo do objeto a esquerda (this) que é ele próprio (classe atual)
    }
    public String getDadosDeImpressao() {
        return modelo + "::" + ano;
    }
    public void setModelo (String modelo) {
        this.modelo = modelo;
        //nesse caso o parâmetro tem o mesmo nome e por isso o this é necessário!
    }
}
