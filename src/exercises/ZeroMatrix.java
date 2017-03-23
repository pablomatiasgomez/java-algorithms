package exercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column is set to 0.
public class ZeroMatrix {

    public static void main(String[] args) {
        int[][] input = new int[5][5];
        input[1][1] = 3;
        input[2][1] = 3;
        input[3][2] = 3;
        input[4][1] = 3;
        input[1][4] = 3;
        input[2][4] = 3;
        input[1][3] = 3;
        input[4][1] = 3;
        input[3][1] = 3;
        input[2][2] = 3;
        input[1][4] = 3;
        input[0][4] = 3;
        input[1][0] = 3;
        input[2][0] = 3;
        input[0][1] = 3;
        input[1][2] = 3;
        printMatrix(input);
        fillWithZeros(input);
        System.out.println("---------------");
        printMatrix(input);
    }

    public static void printMatrix(int[][] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println(Arrays.toString(input[i]));
        }
    }

    public static void fillWithZeros(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }

        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        rows.forEach(row -> {
            for (int j = 0; j < matrix[row].length; j++) {
                matrix[row][j] = 0;
            }
        });

        cols.forEach(col -> {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][col] = 0;
            }
        });

    }
}
