package exercises;

import java.util.Arrays;

// Write a method that sorts an array of integers using selection sort.
public class SelectionSort {

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

		for (int i = 0; i < input.length; i++) {
			int minPos = i;
			for (int j = i; j < input.length; j++) {
				if (input[j] < input[minPos]) {
					minPos = j;
				}
			}
			int aux = input[i];
			input[i] = input[minPos];
			input[minPos] = aux;
		}
	}

}
