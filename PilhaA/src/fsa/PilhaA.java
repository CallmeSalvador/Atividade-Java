package fsa;

public class PilhaA {

    private int[] array;
    private int tamanho;
    private int capacidade;

    public PilhaA(int capacidade) {
        this.capacidade = capacidade;
        this.tamanho = 0;
        this.array = new int[capacidade];
    }

    public void push(int valor) {
        if (tamanho < capacidade) {
            array[tamanho] = valor;
            tamanho++;
        } else {
            throw new IllegalStateException("A pilha está cheia.");
        }
    }

    public int pop() {
        int valorRemovido;
        
        if(tamanho == 0){
            throw new IllegalStateException("A pilha está vazia.");
        } else {
            valorRemovido = array[tamanho -1];
            tamanho --;
            return valorRemovido;
        }
    }

    public int top() {
        if (tamanho > 0) {
            return array[tamanho - 1];
        } else {
            throw new IllegalStateException("A pilha está vazia.");
        }
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }

}
