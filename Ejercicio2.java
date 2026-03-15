import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] edades = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce una edad: ");
            edades[i] = sc.nextInt();
        }

        int min = edades[0];
        int max = edades[0];

        for (int e : edades) {

            if (e < min) {
                min = e;
            }

            if (e > max) {
                max = e;
            }
        }

        System.out.println("Edad mínima: " + min);
        System.out.println("Edad máxima: " + max);
    }
}
