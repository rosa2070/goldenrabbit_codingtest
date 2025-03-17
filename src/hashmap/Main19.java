package hashmap;

import java.util.HashMap;

public class Main19 {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String c : completion) {
            hashMap.put(c, hashMap.getOrDefault(c,0) + 1);
        }

        for (String p : participant) {
            if (hashMap.getOrDefault(p, 0) == 0) {
                return p;
            }
            hashMap.put(p, hashMap.get(p) - 1);
        }
        return null;
    }
}
