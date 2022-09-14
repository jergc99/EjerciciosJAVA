import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre2 = sc.nextLine();
        System.out.println("Introduce tu email: ");
        String email = sc.nextLine();

        System.out.println("Nombre: "+nombre2+", email: "+email);
        sc.close();
    }
}
