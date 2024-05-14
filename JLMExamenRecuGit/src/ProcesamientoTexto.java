import java.util.Scanner;

public class ProcesamientoTexto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa un texto:");
        StringBuilder texto = scanner.nextLine();
        scanner.close();
    }
    public static String convertirAMayusculas(String texto) {
        return texto.toUpperCase();
    }

    public static String recortarEspacios(String texto) {
        return texto.trim();
    }
    public static String convertirAMinusculas(String texto) {
        return texto.toLowerCase();
    }

    public static String invertirTexto(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }
}





