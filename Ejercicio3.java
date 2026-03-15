import java.util.Scanner;
import java.util.Random;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int[] numeros = new int[10];

        // Generar números aleatorios entre 1 y 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(100) + 1;
        }

        // Mostrar números generados
        System.out.println("Números generados:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        System.out.println();

        // Buscar número
        System.out.print("Número a buscar: ");
        int buscar = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == buscar) {

                System.out.println("Encontrado en posición " + i);
                encontrado = true;

            }

        }

        if (!encontrado)
            System.out.println("No existe");

        sc.close();
    }
}