package fsa;

public class PilhaE {

    public class No {

        No proximo;
        String valor;

        public No(String valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }
    No topo;

    public PilhaE() {
        this.topo = null;
    }

    public void push(String valor) {
        No novoNo = new No(valor);
        
       if(topo != null){
           novoNo.proximo = topo;
           topo = novoNo;
       } else {
           topo = novoNo;
       }
    }

    public String pop() {
        if (topo != null) {
            String valorRemovido = topo.valor;
            topo = topo.proximo;
            return valorRemovido;
        } else {
            throw new IllegalStateException("A pilha está vazia.");
        }
    }

    public String top() {
        if (topo != null) {
            return topo.valor;
        } else {
            throw new IllegalStateException("A pilha está vazia.");
        }
    }

    public boolean estaVazia() {
        return topo == null;
    }

}
