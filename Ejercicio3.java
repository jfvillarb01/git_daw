import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            numeros[i] = rand.nextInt(100) + 1;
        }

        Arrays.sort(numeros);

        System.out.println("Array ordenado de mayor a menor:");

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}