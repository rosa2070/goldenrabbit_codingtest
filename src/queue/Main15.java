package queue;

import java.util.ArrayDeque;

public class Main15 {
    public static void main(String[] args) {
        System.out.println(solution(5, 2));
    }

    private static int solution(int N, int K) {
        ArrayDeque<Integer> dequeue = new ArrayDeque<>();
        for (int i=1; i<=N; i++) {
            dequeue.addLast(i);
        }

        while (dequeue.size() > 1) {
            for (int i=1; i<K; i++) {
                dequeue.addLast(dequeue.pollFirst());
            }
            dequeue.pollFirst();
        }

        return dequeue.pollFirst();


    }
}
