import java.util.Scanner;

public class EnvioDePaquetes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- Generador de etiquetas de envio --- \n");

        // primera prueba
        System.out.println("Ingresa los datos del primer paquete:");
        System.out.println("Ingresa un numero de guia");
        String guia1 = teclado.nextLine();

        System.out.println("Ingrsa la ciudad de destino");
        String destino1 = teclado.nextLine();
        System.out.println("ingresa el primer peso en kg");
        double peso1 = teclado.nextDouble();
        teclado.nextLine(); //limpieza de seguridad del teclado
        System.out.println();

        // Segunda Prueba
        System.out.println("Datos del Segundo paquete:");
        System.out.println("Ingresa un numero guia:");
        String guia2 = teclado.nextLine();
        System.out.println("Ingrese la ciudad de destino;");
        String destino2 = teclado.nextLine();
        System.out.println("ingrese peso en kg:");
        double peso2 = teclado.nextDouble();
        System.out.println();

        //La impresion de ambas etiquetas usando el metodo ( sin repetir instrucciones )
        System.out.println("Generando las etiquitas finales");
        Object mostrarEtiqueta;
        mostrarEtiqueta(guia1, destino1, peso1);
        mostrarEtiqueta(guia2, destino2, peso2);

        teclado.close(); //cierra el lector

    }
    /**
     * Muestra en la consola la etiqueta con los datos del paquete.
     */
    public static void mostrarEtiqueta(String numeroGuia, String destino, double peso){
        System.out.println("Etiqueta de envio");
        System.out.println("Numero de Guia " + numeroGuia);
        System.out.println("Destino:" + destino);
        System.out.println("peso" + peso + "kg");

    }
}