package Ejercicios3;

import java.util.Scanner;

public class ejercicio7 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de horas tranajadas esta semana");
        int horastrabajadas = scanner.nextInt();
        
        int tarifaporhora = 12;
        int salarioSemanal = horastrabajadas*tarifaporhora;

        System.out.println("El salario semanal es: S/"+salarioSemanal);
    }
}

    

