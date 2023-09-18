package fsa;

public class TestaPilha {
        public static void main(String[] args) {
            PilhaE pilha = new PilhaE();
            
            pilha.push("5");
            pilha.push("4");
            pilha.push("3");
            pilha.push("2");
            pilha.push("1");
            
            System.out.println(pilha.pop());
            System.out.println(pilha.pop());
            System.out.println(pilha.pop());
            System.out.println(pilha.pop());
            System.out.println(pilha.pop());
    }
}
