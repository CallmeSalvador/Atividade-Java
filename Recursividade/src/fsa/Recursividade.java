package fsa;

public class Recursividade {

    public static void main(String[] args) {
        int[] array = new int[5];
        int indice = array.length;
        array[0] = 1;
        array[1] = 1;
        array[2] = 1;
        array[3] = 1;
        array[4] = 1;

        System.out.println("O fatorial de 5 é: "+ factorial(5));
        System.out.println("O nono número em fibonacci é: "+ fibonacci(9));
        System.out.println("A potência de 2 elevado a 4 é: "+ potencia(2,4));
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

    public static void somarArray(int[] a, int b){}
}
