import java.util.Scanner;

public class RegistroCalificaciones {

    public static void main(String[] args) {
        int[] calificaciones = capturar();
        mostrar(calificaciones);
        int aprobados = contarAprobados(calificaciones);
        int reprobados = contarReprobados(calificaciones);

        System.out.println();
        System.out.println("Alumnos aprobados: " + aprobados);
        System.out.println("Alumnos reprobados: " + reprobados);
    }

    public static int[] capturar() {
        Scanner sc = new Scanner(System.in);
        int[] calificaciones = new int[10];
        int cal;

        for (int i = 0; i < 10; i++) {
            do {
                System.out.print("Captura la calificación del alumno " + (i + 1) + ": ");
                cal = sc.nextInt();
                if (cal < 0 || cal > 100) {
                    System.out.println("Calificación inválida, Solo del 0 a 10");
                }
            } while (cal < 0 || cal > 100);
            calificaciones[i] = cal;
        }
        return calificaciones;
    }

    public static void mostrar(int[] datos) {
        System.out.println();
        System.out.println("Calificaciones capturadas:");
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + datos[i]);
        }
    }

    public static int contarAprobados(int[] datos) {
        int contador = 0;
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] >= 70) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarReprobados(int[] datos) {
        int contador = 0;
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] < 70) {
                contador++;
            }
        }
        return contador;
    }
}
