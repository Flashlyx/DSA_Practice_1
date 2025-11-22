package Collection_Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Array_List_1 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(5);
        a1.add(50);
        a1.add(30);
        System.out.println(a1);

        Collections.sort(a1);
        System.out.println(a1);

        System.out.println(Collections.max(a1));
        System.out.println(Collections.min(a1));

        Collections.shuffle(a1);
        System.out.println(a1);
    }
}
