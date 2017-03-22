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

		int pivot = start;

		for (int j = start + 1; j <= end; j++) {
			if (input[j]  < input[pivot]) {
				swap(input, pivot, j);
			}
		}
		
		quickSort(input, )
	}
	
	private static void swap(int[] input, int from, int to) {
		int aux = input[to];
		input[to] = input[from];
		input[from] = aux;
	}

}
