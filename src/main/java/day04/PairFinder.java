package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class PairFinder {

    public int findPairs(int[] arr) {
        int[] result = Arrays.copyOf(arr, arr.length);
        Arrays.sort(result);

        int count = 0;
        for (int i = 1; i < result.length; i++) {
            if (result[i] == result[i - 1]) {
                count++;
                i++;
            }
        }
        return count;
    }

    public int findPairsInList(List<Integer> numbers) {
        return numbers.stream()
                .collect(groupingBy(
                        o -> o,
                        counting()))
                .values().stream()
                .mapToInt(number -> (int) (number / 2))
                .sum();
    }

    // REKURZIÓ!!!
    // Nem teljesen jó, de cserébe sok, és hosszú...
    public int findPairsRecurcion(int[] arr) {
        if (arr.length > 1) {
            Arrays.sort(arr);
            return switch (arr[0] - arr[1]) {
                case 0 -> 1 + findPairsRecurcion(Arrays.copyOfRange(arr, 2, arr.length));
                default -> 0 + findPairsRecurcion(Arrays.copyOfRange(arr, 1, arr.length));
            };
        }
        return 0;
    }


    public static void main(String[] args) {
        PairFinder pf = new PairFinder();
        System.out.println(pf.findPairs(new int[]{1, 3, 5, 5, 4, 4, 4, 6}));
        System.out.println(pf.findPairsInList(Collections.unmodifiableList(new ArrayList<>(Arrays.asList(1, 3, 5, 5, 4, 4, 4, 6)))));
        System.out.println(pf.findPairsRecurcion(new int[]{1, 3, 5, 5, 4, 4, 4, 6}));
    }
}
