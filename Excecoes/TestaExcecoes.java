package Excecoes;
//São formas de identificar os erros no programa
//Os erros são classificados que é baseada em uma hierárquia de classes
//A hierárquia é formada por:
//  Throwable - lança quaisquer exceções (topo da hierárquia)
//      Qualquer erro de execução é um objeto dessa classe ou de uma que deriva dela.
//  Como filhas de Throwable, temos duas filhas diretas:
//      Error - São erros de execução gerados por uma situação totalmente anormal que não deveria ser prevista pela aplicação.
//      Exception -  são erros de execução que são de responsabilidade das aplicações, ou seja, são as aplicações que devem tratar ou evitar esses erros.
//      são erros que podem acontecer e podem ser tratadas ou evitadas e são dividas em 2 categorias:
//          Checked: não são muito simples de evitar esse tipo
//          Unchecked: são mais simples de serem evitados (Runtime Exception)
//Essas diferenças não ficam apenas na teoria.
// O compilador irá verificar se seu programa pode lançar
// alguma checked exception e, neste caso, obrigá-lo a tratar
// essa exception de alguma maneira. No caso das exceptions
// unchecked, não há nenhuma verificação por parte do
// compilador pelo tratamento ou não.

public class TestaExcecoes {
    public void fazAlgo(int[] idades) {
        //eu preciso fazer várias verificações antes de executar o sout
        /**if (idades != null && idades.length >= 2)**/
            //isso pq o usuário pode mandar null ou até mesmo idades[0] e isso geraria um erro
            //assim, o programador precisa estar preparado para essas situações
            //mas imagine se o código fosse muito maior que esse, certamente esse if seria enorme
            //e é ai que entra a utilidade das exceções.
            //evita que o programador precise prever todos os cenários de erros possíveis
            System.out.println(idades[1]);
    }

    public static void main(String[] args) {
        new TestaExcecoes().fazAlgo(new int[0]); //isso lançaria uma exception
    }
}
