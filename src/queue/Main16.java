package queue;

import java.util.*;

public class Main16 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> answer = new ArrayDeque<>();

        int n = progresses.length;

        int[] daysLeft = new int[n];
        for (int i=0; i<n; i++) {
            daysLeft[i] = (int)Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }

        int count = 0;
        int maxDay = daysLeft[0];

        for (int i=0; i<n; i++) {
            if (daysLeft[i] <= maxDay) {
                count++;
            } else {
                answer.add(count);
                count = 1;
                maxDay = daysLeft[i];
            }
        }

        answer.add(count);

        int[] result = new int[answer.size()];
        int index = 0;
        while (!answer.isEmpty()) {
            result[index++] = answer.poll();
        }

        return result;
        // return answer.stream().mapToInt(Integer::intValue).toArray();



    }
}