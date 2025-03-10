package queue;

import java.util.ArrayDeque;

public class Example2 {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.addLast(1);
        queue.addLast(2);
        queue.addLast(3);

        int first = queue.pollFirst();
        System.out.println(first);

        queue.addLast(4);
        queue.addLast(5);

        first = queue.pollFirst();
        System.out.println(first);
    }
}
