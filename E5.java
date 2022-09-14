import java.util.Scanner;

import utils.EjercicioCinco;

public class E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero(0-50): ");

        int numero4 = sc.nextInt();
        while (numero4 < 1 || numero4 > 50) {
            System.out.println("El numero no es valido. Introduce otro: ");
            numero4= sc.nextInt();
        }
        EjercicioCinco ej = new EjercicioCinco();
        System.out.println(ej.parImpar(numero4));
        sc.close();
    }
}
