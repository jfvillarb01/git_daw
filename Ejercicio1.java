import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Números introducidos:");
        for (int n : numeros) {
            System.out.println(n);
        }
    }
}
