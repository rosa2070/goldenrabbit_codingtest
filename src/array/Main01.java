package array;

import java.util.Arrays;

public class Main01 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new int[]{1, -5, 2, 4, 3})));
        System.out.println(Arrays.toString(solution1(new int[]{2, 1, 1, 3, 2, 5, 4})));
        System.out.println(Arrays.toString(solution1(new int[]{6, 1, 7})));

        // clone()를 사용하여 배열을 복사한 경우
        int[] org = {4, 2, 3, 1, 5};
        int[] sorted = solution1(org);
        System.out.println(Arrays.toString(org));
        System.out.println(Arrays.toString(sorted));

        // clone()를 사용하지 않고 원본 배열을 수정한 경우
        int[] org1 = {4, 2, 3, 1, 5};
        int[] sorted1 = solution(org);
        System.out.println(Arrays.toString(org1));
        System.out.println(Arrays.toString(sorted1));
    }

    private static int[] solution(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    // clone 메서드 사용
    private static int[] solution1(int[] arr) {
        int[] clone = arr.clone();
        Arrays.sort(clone);
        return clone;
    }
}
