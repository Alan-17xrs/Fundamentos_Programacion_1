import java.util.Scanner;
public class SistemaAcademico {
    public  static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el promedio del alumno: ");
        double promedio = teclado.nextDouble();

        System.out.print("Ingrese el porcentaje de asistencia (0-100): ");
        double asistencia = teclado.nextDouble();

        if (promedio < 7.0) {
            System.out.println("Reprobado por calificacion");
        } else if (asistencia < 80.0) {
            System.out.println("Reprobado por faltas");

        } else {
            System.out.println("Apeobado regular");
        }
        teclado.close();
    }

        }


