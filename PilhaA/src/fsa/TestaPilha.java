package fsa;

public class TestaPilha {

    public static void main(String[] args) {
        PilhaA pilha = new PilhaA(5);
        
        pilha.push(20);
        pilha.push(30);
        
        System.out.println("Topo da pilha: " + pilha.top());
        System.out.println("Tamanho da pilha: " + pilha.tamanho());
        
        while (!pilha.estaVazia()) {
            System.out.println("Desempilhar: " + pilha.pop());
        }
    }
}
