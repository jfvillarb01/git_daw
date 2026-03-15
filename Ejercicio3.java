import java.util.ArrayList;
import java.util.Random;

public class Ejercicio3 {

    public static void main(String[] args) {

        Random r = new Random();

        int[] numeros = new int[10];

        // Generar números aleatorios entre 1 y 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(100) + 1;
        }

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        // Separar números pares e impares
        for (int n : numeros) {

            if (n % 2 == 0)
                pares.add(n);
            else
                impares.add(n);

        }

        // Mostrar resultados
        System.out.println("Números generados:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        System.out.println("\n\nNúmeros pares:");
        for (int p : pares) {
            System.out.print(p + " ");
        }

        System.out.println("\n\nNúmeros impares:");
        for (int i : impares) {
            System.out.print(i + " ");
        }

    }
}