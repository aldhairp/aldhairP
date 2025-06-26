public class EjercicioTwo {
    public static void main(String[] args) {
       System.out.println("Números del 1 al 100 con condiciones:");
        
        for (int i = 1; i <= 100; i++) {
            boolean esMultiploDe3 = (i % 3 == 0);
            boolean esMultiploDe5 = (i % 5 == 0);
            
            if (esMultiploDe3 && esMultiploDe5) {
                // Múltiplo de 3 y 5 por la palabra "funf"
                System.out.print("funf");
            } else if (esMultiploDe3) {
                // Los múltiplos de 3 por la palabra "drei"
                System.out.print("drei");
            } else if (esMultiploDe5) {
                // Los múltiplos de 5 por la palabra "funf"
                System.out.print("funf");
            } else {
                System.out.print(i);
            }
            
            System.out.println(); // Salto de línea entre cada impresión
        }
    }
    
}
