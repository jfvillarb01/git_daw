import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] edades = new int[5]; // array de edades
        boolean todosMayores = true;

        // pedir edades
        for (int i = 0; i < edades.length; i++) {
            System.out.print("Introduce edad: ");
            edades[i] = sc.nextInt();
        }

        // comprobar si todos son mayores
        for (int e : edades) {

            if (e < 18) {
                todosMayores = false;
                break; // salir si encontramos un menor
            }

        }

        System.out.println("¿Todas las personas son mayores de edad?: " + todosMayores);

        sc.close();
    }
}