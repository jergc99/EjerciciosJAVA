import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad2 = sc.nextInt();
        if (edad2>=18) {
            System.out.println("Eres mayor de edad");
        } else{
            System.out.println("Eres menor de edad");
        }
        sc.close();
    }
}
