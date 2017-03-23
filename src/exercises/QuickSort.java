package exercises;

import java.util.Arrays;

// Write a method that sorts an array of integers using quicksort.
public class QuickSort {

    public static void main(String[] args) {
        int[] input = new int[] { 64, 25, 12, 22, 11 };
        System.out.println(Arrays.toString(input));
        sort(input);
        System.out.println(Arrays.toString(input));
    }

    public static void sort(int[] input) {
        if (input == null) {
            return;
        }

        quickSort(input, 0, input.length - 1);
    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start <= 0) {
            return;
        }

        int pivot = input[start];
        int i = start + 1;

        for (int j = i; j <= end; j++) {
            if (input[j] < pivot) {
                swap(input, i, j);
                i++;
            }
        }
        i--; // punto donde va a quedar el pivot

        swap(input, start, i);
        quickSort(input, start, i - 1);
        quickSort(input, i + 1, end);
    }

    private static void swap(int[] input, int from, int to) {
        int aux = input[to];
        input[to] = input[from];
        input[from] = aux;
    }

}
