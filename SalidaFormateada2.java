public class SalidaFormateada2 {
      public static void main(String[] args) {
        System.out.println("Articulo\tPrecio\tN° Cajas");
        System.out.println("--------\t------\t--------");
        System.out.printf("%-10s\t%8.2f\t%6d\n", "manzana",4.5,10);
        System.out.printf("%-10s\t%7.2f\t%9d\n", "mango",1.5,11);
        System.out.printf("%-10s\t%9.2f\t%3d\n", "platano",0.70,18);
        System.out.printf("%-10s\t%4.2f\t%4d\n", "uva",9.80,12);
        System.out.printf("%-10s\t%6.2f\t%7d\n", "fresa",8.20,14);
        }
    }
