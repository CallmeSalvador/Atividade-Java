package fsa;

public class FilaA {

    private String[] array;
    private int tamanho;
    private int inicio;
    private int fim;

    public FilaA(int capacidade) {
        array = new String[capacidade];
        tamanho = 0;
        inicio = 0;
        fim = -1;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public void enqueue(String valor) {
        if (tamanho == array.length) {
            throw new IllegalStateException("A fila está cheia.");
        }
        fim = (fim + 1) % array.length;
        array[fim] = valor;
        tamanho++;
    }

    public String dequeue() {
        if (tamanho == 0) {
            throw new IllegalStateException("A fila está vazia.");
        }
        String valorRemovido = array[inicio];
        inicio = (inicio + 1) % array.length;
        tamanho--;
        return valorRemovido;
    }
}
