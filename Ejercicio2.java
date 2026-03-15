import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] edades = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce una edad: ");
            edades[i] = sc.nextInt();
        }

        System.out.println("Edades introducidas:");

        for (int e : edades) {
            System.out.println(e);
        }
    }
}
