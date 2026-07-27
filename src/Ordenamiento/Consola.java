package Ordenamiento;

public class Consola {

    public static void imprimirTitulo(String titulo) {
        System.out.println("\n═══════════════════════════════════════════");
        System.out.println("  " + titulo);
        System.out.println("═══════════════════════════════════════════");
    }

    public static void imprimirSeccion(String nombre) {
        System.out.println("\n── " + nombre + " ──");
    }

    public static void imprimirArreglo(String etiqueta, int[] arreglo) {
        System.out.print("  " + etiqueta + ": [ ");
        for (int elemento : arreglo)
            System.out.print(elemento + " ");
        System.out.println("]");
    }

    public static void imprimirDato(String etiqueta, Object valor) {
        System.out.printf("  %-20s: %s%n", etiqueta, valor);
    }
}