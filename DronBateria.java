import java.util.Scanner;

public class DronBateria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Batería inicial: ");
        int bateria = scanner.nextInt();

        int minuto = 1;

        while (bateria >= 7) {
            bateria = bateria - 7;
            System.out.println("Minuto " + minuto + " -> " + bateria + "%");
            minuto++;
        }

        scanner.close();
    }
}
