import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] edades = new int[5];

        int mayores = 0;
        int menores = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce una edad: ");
            edades[i] = sc.nextInt();
        }

        for (int e : edades) {

            if (e >= 18) {
                mayores++;
            } else {
                menores++;
            }
        }

        System.out.println("Mayores de edad: " + mayores);
        System.out.println("Menores de edad: " + menores);
    }
}
