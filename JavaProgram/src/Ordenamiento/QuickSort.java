package Ordenamiento;

/**
 * QuickSort
 */
public class QuickSort {

    /**
     * Metodo para particionar la lista ingresada y hacerle quick sort
     * @param arr
     * @param low
     * @param high
     * @return
     */
    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low-1);

        for (int j=low; j<high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    /**
     * Metodo para acomodar los elementos de una lista utilizando el quicksort
     * @param arr
     */
    public void sort(int arr[]) {
        this.sort(arr, 0, arr.length-1);
    }
    private void sort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

}
