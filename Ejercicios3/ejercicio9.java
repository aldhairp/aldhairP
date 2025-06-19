package Ejercicios3;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la nota del primer examen: ");
        double notaPrimerExamen = scanner.nextDouble();

          System.out.println("¿Que nota quieres sacar en el trimestre? ");
        double notadeseada = scanner.nextDouble();

        double notaSegExamen = (notadeseada = (notaPrimerExamen * 0.4))/ 0.6;

        System.out.printf("Para tener un %.2f en el trimestre nesecitas sacar un %.2f en el segundo examen.\n", notadeseada, notaSegExamen);
    }
}

