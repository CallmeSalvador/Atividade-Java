
package fsa;

public class TestaFila {
        public static void main(String[] args) {
            FilaLe fila = new FilaLe();
            
            fila.enqueue("Baby");
            fila.enqueue("Baby");
            fila.enqueue("Crazy");
            fila.enqueue("Crazy");
            System.out.println(fila.dequeue());
            System.out.println(fila.dequeue());
            System.out.println(fila.dequeue());
            System.out.println(fila.dequeue());
    }
}
