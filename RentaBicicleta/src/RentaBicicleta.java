 import java.util.Scanner;

public class RentaBicicleta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== RENTA DE BICICLETAS ===");
        System.out.println("1. Urbana - $40/hr | 2. Montaña - $60/hr | 3. Eléctrica - $90/hr");
        System.out.print("Tipo (1-3): ");
        int tipo = sc.nextInt();
        System.out.print("Horas: ");
        int horas = sc.nextInt();
        System.out.print("¿Membresía? (true/false): ");
        boolean memb = sc.nextBoolean();

        String nombre = "";
        double tarifa = 0;
        boolean valido = true;

        switch (tipo) {
            case 1: nombre = "Urbana"; tarifa = 40; break;
            case 2: nombre = "de Montaña"; tarifa = 60; break;
            case 3: nombre = "Eléctrica"; tarifa = 90; break;
            default: System.out.println("Opción no válida"); valido = false;
        }

        if (valido) {
            if (horas > 0) {
                double subtotal = tarifa * horas;
                double desc = memb ? subtotal * 0.20 : 0;
                System.out.println("\nBicicleta: " + nombre);
                System.out.println("Subtotal: $" + subtotal);
                System.out.println("Descuento: $" + desc);
                System.out.println("TOTAL: $" + (subtotal - desc));
            } else {
                System.out.println("Error: Las horas deben ser mayores a cero");
            }
        }
        sc.close();
    }
}
