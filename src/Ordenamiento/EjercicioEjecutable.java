package Ordenamiento;

import java.util.Random;

public class EjercicioEjecutable {

    private static final Random random = new Random();
    private static final int TAMANIO_ARREGLO = 10;
    private static final int VALOR_MINIMO = 1;
    private static final int VALOR_MAXIMO = 100;

    private static int[] generarArregloRandom() {
        int[] arreglo = new int[TAMANIO_ARREGLO];
        for (int i = 0; i < TAMANIO_ARREGLO; i++) {
            arreglo[i] = random.nextInt(VALOR_MAXIMO - VALOR_MINIMO + 1) + VALOR_MINIMO;
        }
        return arreglo;
    }

    public static void ejecutarShellSort() {
        Consola.imprimirTitulo("Shell Sort");
        int[] arreglo = generarArregloRandom();
        Consola.imprimirArreglo("Antes", arreglo);
        MetodosOrdenamiento.shellSort(arreglo);
        Consola.imprimirArreglo("Despues", arreglo);
    }

    public static void ejecutarCountingSort() {
        Consola.imprimirTitulo("Counting Sort");
        int[] arreglo = generarArregloRandom();
        Consola.imprimirArreglo("Antes", arreglo);
        int[] resultado = MetodosOrdenamiento.countingSort(arreglo, VALOR_MAXIMO);
        Consola.imprimirArreglo("Despues", resultado);
    }
}