package EjerciciosNamberFour;

import java.util.Scanner;

public class Ejercicio6 {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        // Solicitar tres números enteros
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Introduce el tercer número: ");
        int num3 = scanner.nextInt();

        int mayor, medio, menor;

        // Comparar y ordenar usando if-else
        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
            if (num2 >= num3) {
                medio = num2;
                menor = num3;
            } else {
                medio = num3;
                menor = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
            if (num1 >= num3) {
                medio = num1;
                menor = num3;
            } else {
                medio = num3;
                menor = num1;
            }
        } else {
            mayor = num3;
            if (num1 >= num2) {
                medio = num1;
                menor = num2;
            } else {
                medio = num2;
                menor = num1;
            }
        }

        // Mostrar el resultado ordenado de menor a mayor
        System.out.println("Números ordenados de menor a mayor: " + menor + ", " + medio + ", " + mayor);

        

    }
}

