package datastruc2024.chap3;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(char[] data) {
        int n = data.length;

        for (int k = 1; k < n; k++) {
            char cur = data[k];
            int j = k;

            while (j > 0 && data[j-1] > cur) {
                data[j] = data[j-1];
                j--;
            }
            
            data[j] = cur;
            System.out.println("\ncur: " + cur + " " + Arrays.toString(data));
        }
    }

    public static void main(String[] args) {
        char[] arr = {'B', 'C', 'D', 'A', 'E', 'H', 'G', 'F'};
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        insertionSort(arr);

        System.out.println("\nSorted array: " + Arrays.toString(arr));
    }
}
