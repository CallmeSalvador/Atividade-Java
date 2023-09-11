package fsa;

public class TestaListaSimples {
    public static void main(String[] args) {
        
        NO primeiro = new NO("Nelio");
        NO segundo = new NO("Bianca");
        NO terceiro = new NO("Marcela");
        NO quarto = new NO("Clara");
        NO quinto = new NO("Ana");
        NO sexto = new NO("Rodrigo");

        // inserindo o 2o nó na lista simples.
        primeiro.prox = segundo;
        segundo.prox = terceiro;
        terceiro.prox = quarto;
        quarto.prox = quinto;
        quinto.prox = sexto;

        // mostra a lista
        NO corrente = primeiro;
        
        while (corrente != null) {
            System.out.print(corrente.dado + " -> ");
            corrente = corrente.prox;
        }
        System.out.println("null");
    }
}