import java.util.Scanner;

public class EjercicioFive {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        if (num2 == 0) {
            System.out.println("No se puede dividir entre cero.");
        } else if (num1 % num2 == 0) {
            System.out.println(num1 + " es divisible entre " + num2);
        } else {
            System.out.println(num1 + " NO es divisible entre " + num2);
        }
    }
}
