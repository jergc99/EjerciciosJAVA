import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adivina el numero: ");
        int numero3=sc.nextInt();
        while (numero3!=5) {
            System.out.println("No, prueba con otro: ");
            numero3 = sc.nextInt();
        } if (numero3==5) {
            System.out.println("Correcto");
        }
        sc.close();
    }
}
