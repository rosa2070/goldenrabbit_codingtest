package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class Main02 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution2(new int[]{4, 2, 2, 1, 3, 4})));
        System.out.println(Arrays.toString(solution2(new int[]{2, 1, 1, 3, 2, 5, 4})));
    }

    private static int[] solution(int[] arr) {
        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        Arrays.sort(result, Collections.reverseOrder());
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }

    private static int[] solution2(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int num : arr) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        for (int i=0; i<result.length; i++) {
            result[i] = set.pollFirst();
        }
        return result;
    }
}
