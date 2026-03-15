import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un número: ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }

        System.out.println("Números introducidos:");
        for (int n : numeros) {
            System.out.println(n);
        }

        double media = (double) suma / numeros.length;

        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
    }
}
