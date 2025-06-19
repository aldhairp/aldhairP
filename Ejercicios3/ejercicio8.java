package Ejercicios3;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce la cantidad en megabytes (MB):");
        double megabytes= scanner.nextDouble();

        double kilobytes = megabytes = 1024;
        System.out.println(megabytes+"MB equivale a "+ kilobytes+"KB");
    }
}
    

