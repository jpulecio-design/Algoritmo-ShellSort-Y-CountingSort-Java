package Ordenamiento;

public class MetodosOrdenamiento {

    public static void shellSort(int[] arreglo) {
        int longitud = arreglo.length;
        int gap = longitud / 2;

        while (gap > 0) {
            for (int i = gap; i < longitud; i++) {
                int elementoActual = arreglo[i];
                int j = i;
                while (j >= gap && arreglo[j - gap] > elementoActual) {
                    arreglo[j] = arreglo[j - gap];
                    j -= gap;
                }
                arreglo[j] = elementoActual;
            }
            gap /= 2;
        }
    }

    public static int[] countingSort(int[] arreglo, int valorMaximo) {
        int[] conteo = new int[valorMaximo + 1];

        for (int elemento : arreglo)
            conteo[elemento]++;

        int[] resultado = new int[arreglo.length];
        int posicion = 0;

        for (int valor = 0; valor <= valorMaximo; valor++) {
            while (conteo[valor] > 0) {
                resultado[posicion] = valor;
                posicion++;
                conteo[valor]--;
            }
        }
        return resultado;
    }
}