package quicksortaedsi;

import java.util.Arrays;

// Antonio Carlos Júnior Ra:0049263

public class QuickSortAedsI {
    
    public static void quickSort(int[] A, int p, int r) {
        if (p < r) {
            int q = partition(A, p, r);
            quickSort(A, p, q - 1);
            quickSort(A, q + 1, r);
        }
    }
    
    public static int partition(int[] A, int p, int r) {
        int pivot = A[r];
        int i = p - 1;
        for (int j = p; j <= r - 1; j++) {
            if (A[j] <= pivot) {
                i++;
                swap(A, i, j);
            }
        }
        swap(A, i + 1, r);
        return i + 1;
    }
    
    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    
    public static void main(String[] args) {
        int[] array = {2, 8, 7, 1, 3, 6};
        System.out.println("Vetor original: " + Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println("Vetor ordenado: " + Arrays.toString(array));
    }
}
