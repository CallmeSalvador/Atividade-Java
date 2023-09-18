package fsa;

public class FilaLe {

    public class No {

        No proximo;
        String valor;

        public No(String valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    private No primeiro;
    private No ultimo;

    public FilaLe() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public boolean estaVazia() {
        boolean estado;

        estado = primeiro == null;
        return estado;
    }

    public void enqueue(String valor) {
        No novoNo = new No(valor);

        if (ultimo == null) {
            primeiro = novoNo;
            ultimo = novoNo;
        } else {
            ultimo.proximo = novoNo;
            ultimo = novoNo;
        }
    }
    public String dequeue(){
        String valorRemovido;
        if(estaVazia()){
            throw new IllegalStateException("A fila está vazia.");
        }//estudar sobre essa exceção
        valorRemovido = primeiro.valor;
        primeiro = primeiro.proximo;
        return valorRemovido;
    }
}
