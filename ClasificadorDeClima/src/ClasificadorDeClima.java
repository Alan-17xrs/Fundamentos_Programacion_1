import java.util.Scanner;

public class ClasificadorDeClima {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en °C: ");
        double temperatura = teclado.nextDouble();

        if (temperatura < 18) {
            System.out.println("Frío extremo");
        } else if (temperatura < 28) {
            System.out.println("Clima fresco");
        } else if (temperatura < 38) {
            System.out.println("Clima agradable");
        } else {
            System.out.println("Calor extremo");
        }

        teclado.close();}
    }