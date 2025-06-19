package Ejercicios3;

import java.util.Scanner;

public class ejercicio6 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("introduce la base del triangulo:");
        double base = scanner.nextDouble();

        System.out.println("introduce la altura del triangulo");
        double altura = scanner.nextDouble();

        double area = (base * altura )/2;

        System.out.println("El area del triangulo es :"+ area);
    }
}

