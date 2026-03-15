import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] edades = new int[5];

        int rango1 = 0; // 0-17
        int rango2 = 0; // 18-30
        int rango3 = 0; // 31-50
        int rango4 = 0; // 51+

        // Pedir edades
        for (int i = 0; i < edades.length; i++) {
            System.out.print("Introduce una edad: ");
            edades[i] = sc.nextInt();
        }

        // Clasificar edades
        for (int e : edades) {

            if (e <= 17) {
                rango1++;
            } else if (e <= 30) {
                rango2++;
            } else if (e <= 50) {
                rango3++;
            } else {
                rango4++;
            }

        }

        // Mostrar resultados
        System.out.println("\nResultados por rangos de edad:");
        System.out.println("0 - 17 años: " + rango1);
        System.out.println("18 - 30 años: " + rango2);
        System.out.println("31 - 50 años: " + rango3);
        System.out.println("51 o más años: " + rango4);

        sc.close();
    }
}