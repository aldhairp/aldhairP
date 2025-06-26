import java.util.Scanner;

public class VocalSimple {
    public static void main(String[] args) throws java.io.IOException {
        System.out.print("Ingresa un carácter: ");
        char c = (char) System.in.read();

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            System.out.println("Es una vocal.");
        } else {
            System.out.println("No es una vocal.");
        }
    }
}