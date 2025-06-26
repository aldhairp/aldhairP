import java.util.Scanner;

public class EjercicioFour {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menor;
        System.out.print("Ingrese un número: ");
        menor = sc.nextInt();

        for (int i = 1; i < 5; i++) {
            System.out.print("Ingrese otro número: ");
            int num = sc.nextInt();
            if (num < menor) {
                menor = num;
            }
        }

        System.out.println("El menor número es: " + menor);
    }
}
