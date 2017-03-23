package exercises;

import java.util.HashSet;
import java.util.Set;

//Given a string with unique characters, generate all the possible permutations.
public class StringPermutations {

    public static void main(String[] args) {
        String input = "abcde";
        System.out.println(input);
        Set<String> res = permutations(input);
        System.out.println(res);
    }

    public static Set<String> permutations(String input) {
        Set<String> answer = new HashSet<>();
        if (input == null) {
            return answer;
        }
        permutations(input.toCharArray(), 0, answer);
        return answer;
    }

    private static void permutations(char[] input, int i, Set<String> answer) {
        if (i == input.length) {
            answer.add(new String(input));
        }
        for (int j = i; j < input.length; j++) {
            swap(input, i, j);
            permutations(input, i + 1, answer);
            swap(input, i, j);
        }
    }

    private static void swap(char[] input, int from, int to) {
        char aux = input[to];
        input[to] = input[from];
        input[from] = aux;
    }

}
