import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.print("Cantidad de números: ");
        int cantidad = sc.nextInt();

        for (int i = 0; i < cantidad; i++) {
            numeros.add(sc.nextInt());
        }

        System.out.print("Número a eliminar: ");
        int eliminar = sc.nextInt();

        numeros.remove(Integer.valueOf(eliminar));

        System.out.println("Array final:");

        for (int n : numeros) {
            System.out.println(n);
        }
    }
}