import java.util.Random;

public class Ejercicio3 {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            numeros[i] = rand.nextInt(100) + 1;
        }

        System.out.println("Array generado:");

        for (int n : numeros) {
            System.out.println(n);
        }
    }
}