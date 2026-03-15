import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de números: ");
        int cantidad = sc.nextInt();

        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {

            int contador = 0;

            for (int j = 0; j < numeros.length; j++) {

                if (numeros[i] == numeros[j]) {
                    contador++;
                }
            }

            System.out.println(numeros[i] + " se repite " + contador + " veces");
        }
    }
}