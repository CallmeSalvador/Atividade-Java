package fsa;

public class Recursividade {

    public static void main(String[] args) {
        int[] array = new int[5];
        int indice = array.length;
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        System.out.println("O fatorial de 5 é: "+ factorial(5));
        System.out.println("O nono número em fibonacci é: "+ fibonacci(9));
        System.out.println("A potência de 2 elevado a 4 é: "+ potencia(2,4));
        System.out.println("soma= " + somaArray(array, 5));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    private static int fibonacci(int num) {
        if (num == 0 || num == 1) {
            return num;
        } else {
            return (fibonacci(num - 1) + fibonacci(num - 2));
        }
    }

    public static int potencia(int b, int e) {
        //'b' de base e 'e' de expoente
        if (e == 0) {
            return 1;
        } else {
            return b * potencia(b, e - 1);
        }
    }
    
    public static int somaArray(int[] array, int tamanho) {
        // Caso base: se o tamanho do array for 0, a soma é 0.
        if (tamanho == 0) {
            return 0;
        } else {
            // Chamada recursiva: soma o elemento atual com a soma dos elementos restantes.
            return array[tamanho - 1] + somaArray(array, tamanho - 1);
        }
    }
}
