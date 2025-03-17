package array;

import java.util.HashSet;

public class Main03 {

    public static int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();

        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
