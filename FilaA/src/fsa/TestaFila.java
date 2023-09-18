package fsa;

public class TestaFila {

    public static void main(String[] args) {
        FilaA fila = new FilaA(5);
        
        fila.enqueue("Maçã");
        fila.enqueue("Banana");
        fila.enqueue("Melancia");
        fila.enqueue("Lixia");
        
        while (!fila.isEmpty()) {
            System.out.println("Desenfileirar: " + fila.dequeue());
        }
    }
}
