import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        int suma = 0;
        int mayor;
        int menor;
        int positivos = 0;
        int negativos = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un número: ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }

        mayor = numeros[0];
        menor = numeros[0];

        for (int n : numeros) {

            if (n > mayor) {
                mayor = n;
            }

            if (n < menor) {
                menor = n;
            }

            if (n >= 0) {
                positivos++;
            } else {
                negativos++;
            }
        }

        double media = (double) suma / numeros.length;

        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
    }
}
