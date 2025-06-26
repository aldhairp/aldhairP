import java.util.Scanner;

public class EjercicioTri {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precio = 7.0;
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad <= 5) {
            precio = precio * 0.60; // 40% de descuento
        } else if (edad >= 60) {
            precio = precio * 0.45; // 55% de descuento
        }

        System.out.println("El precio final es: " + precio + " soles");
    }
}

