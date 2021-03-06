package Ordenamiento;

import java.util.Arrays;

/**
 * RadixSort
 */
public class RadixSort {

    /**
     * Metodo para encontrar el mayor elemento dentro de la lista ingresada
     * @param arr
     * @param n
     * @return
     */
    static int getMax(int arr[], int n) {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }

    /**
     * Metodo para acomodar la lista brindada por medio del RadixSort
     * @param arr
     */
    public void radixsort(int arr[]){
        this.radixsort(arr, arr.length);
    }

    private void radixsort(int arr[], int n)
    {
        int m = getMax(arr, n);
        for (int exp = 1; m/exp > 0; exp *= 10) {
            countSort(arr, n, exp);
        }
    }

    /**
     * Contador de decenas, centenas y unidades
     */
    void countSort(int arr[], int n, int exp) {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count,0);

        for (i = 0; i < n; i++)
            count[ (arr[i]/exp)%10 ]++;
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
        for (i = n - 1; i >= 0; i--) {
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i];
            count[ (arr[i]/exp)%10 ]--;
        }
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }

    /**
     * Metodo para imprimir los datos de una lista
     * @param arr
     */
    public void print(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}
