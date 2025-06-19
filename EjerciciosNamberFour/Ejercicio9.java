public static void ejercicio9() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== GENERADOR DE NÓMINA ===");
        
        // Pedir datos básicos
        System.out.print("Nombre del empleado: ");
        scanner.nextLine(); // Limpiar buffer
        String nombre = scanner.nextLine();
        
        System.out.println("\nSelecciona el cargo:");
        System.out.println("1 - Programador junior (950 soles)");
        System.out.println("2 - Programador senior (1200 soles)");
        System.out.println("3 - Jefe de proyecto (1600 soles)");
        System.out.print("Cargo (1-3): ");
        int cargo = scanner.nextInt();
        
        System.out.print("Días de viaje del mes: ");
        int diasViaje = scanner.nextInt();
        
        System.out.println("\nEstado civil:");
        System.out.println("1 - Soltero (25% IRPF)");
        System.out.println("2 - Casado (20% IRPF)");
        System.out.print("Estado civil (1-2): ");
        int estadoCivil = scanner.nextInt();
        
        // Calcular sueldo base según el cargo
        double sueldoBase = 950; // Por defecto junior
        String nombreCargo = "Programador junior";
        
        if (cargo == 2) {
            sueldoBase = 1200;
            nombreCargo = "Programador senior";
        } else if (cargo == 3) {
            sueldoBase = 1600;
            nombreCargo = "Jefe de proyecto";
        }
        
        // Calcular extras
        double dietas = diasViaje * 30; // 30 soles por día de viaje
        double sueldoBruto = sueldoBase + dietas;
        
        // Calcular descuentos
        double porcentajeIRPF = (estadoCivil == 1) ? 25 : 20; // Soltero 25%, Casado 20%
        double descuentoIRPF = sueldoBruto * porcentajeIRPF / 100;
        double sueldoNeto = sueldoBruto - descuentoIRPF;
        
        // Mostrar nómina
        System.out.println("\n" + "=".repeat(40));
        System.out.println("           NÓMINA DEL EMPLEADO");
        System.out.println("=".repeat(40));
        System.out.println("Empleado: " + nombre);
        System.out.println("Cargo: " + nombreCargo);
        System.out.println("-".repeat(40));
        System.out.println("Sueldo base:         " + String.format("%8.2f", sueldoBase) + " soles");
        System.out.println("Dietas (" + diasViaje + " días):      " + String.format("%8.2f", dietas) + " soles");
        System.out.println("-".repeat(40));
        System.out.println("SUELDO BRUTO:        " + String.format("%8.2f", sueldoBruto) + " soles");
        System.out.println("Descuento IRPF (" + (int)porcentajeIRPF + "%): " + String.format("%8.2f", descuentoIRPF) + " soles");
        System.out.println("=".repeat(40));
        System.out.println("SUELDO NETO:         " + String.format("%8.2f", sueldoNeto) + " soles");
        System.out.println("=".repeat(40));
    }
    
    // Método principal para ejecutar todos los ejercicios
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== EJERCICIOS DE SENTENCIAS CONDICIONALES ===");
        System.out.println("Selecciona el ejercicio que quieres ejecutar (1-9): ");
        System.out.println("1. Cálculo de salario semanal");
        System.out.println("2. Resolver ecuación de primer grado");
        System.out.println("3. Calcular media y calificación");
        System.out.println("4. Horóscopo");
        System.out.println("5. Minicuestionario");
        System.out.println("6. Ordenar tres números");
        System.out.println("7. Verificar par/divisible entre 5"); 
        System.out.println("8. Calcular precio final");
        System.out.println("9. Generar nómina");
        
        int opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                ejercicio1();
                break;
            case 2:
                ejercicio2();
                break;
            case 3:
                ejercicio3();
                break;
            case 4:
                ejercicio4();
                break;
            case 5:
                ejercicio5();
                break;
            case 6:
                ejercicio6();
                break;
            case 7:
                ejercicio7();
                break;
            case 8:
                ejercicio8();
                break;
            case 9:
                ejercicio9();
                break;
            default:
                System.out.println("Opción no válida");
        }
        
        scanner.close();
    }
