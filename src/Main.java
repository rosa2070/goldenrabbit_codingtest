import org.w3c.dom.Node;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 3};
        System.out.println(arr.length);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 3));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        Collections.sort(list);
        System.out.println(list);

    }


}