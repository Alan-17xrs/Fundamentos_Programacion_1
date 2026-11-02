import java.util.Scanner;

public class EstimadorDescarga {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Estimador de tiempo de descarga");
        //captura y validacion del tamaño del archivo
        System.out.println("Introduce el archivo en MB: ");
        double tamaño = scanner.nextDouble();
        if (tamaño < 0 ){
            System.out.println("Error: El tamaño del archivo no puede ser negativo.");
            return;

        }
        //captura y validacion de la velocidad de descarga
        System.out.println("Introduce la velocidad de la descarga en MB/s:");
        double velocidad = scanner.nextDouble();
        if (velocidad <= 0) {
            System.out.println("Error: la velocidad de descrga debe ser mayor a cero.");
            return;

        }
        // llamada al metodo y muestra resultado
        double tiempoEstimado = calcularTiempo(tamaño,velocidad);
        System.out.printf("El tiempo estimado de descarga es: %.2f segundos.%n" , tiempoEstimado);
        scanner.close();

    }
    /**
     * Calcula el tiempo estimado de descarga.
     * @param tamaño Tamaño del archivo en MB.
     * @param velocidad Velocuidad de descarga MB/s.
     * @return Tiempo estimado en segundos.
     */

    public static double calcularTiempo(double tamaño, double velocidad) {
        return tamaño / velocidad;
    }
}
