package array;

import java.util.Arrays;

public class Main01_1 {
    public static void main(String[] args) {
        int[] arr = new int[100000];

        // Bubble 정렬 코드 시간 측정
        // 1.879초
        long start = System.currentTimeMillis();
        int[] bubble = bubbleSort(arr);
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0 + "초");

        // 정렬 API 코드 시간 측정
        // 0.003초
        start = System.currentTimeMillis();
        int[] sort = doSort(arr);
        end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0 + "초");
        // 두 개의 배열이 같은지 확인
        System.out.println(Arrays.equals(bubble, sort));
    }

    private static int[] bubbleSort(int[] org) {
        int[] arr = org.clone();
        int n = arr.length;
        for (int i=0; i<n; i++) {
            for (int j=0; j< n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }

    private static int[] doSort(int[] org) {
        int[] arr = org.clone();
        Arrays.sort(arr);
        return arr;
    }

}
