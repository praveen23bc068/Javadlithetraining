package list;

import java.util.Vector;

public class sample3 {
    public static void main(String[] args) {

        Vector<Integer> v1 = new Vector<>();

        v1.add(10);
        v1.add(20);
        v1.add(30);
        v1.add(40);
        v1.add(50);

        System.out.println(v1);

        v1.add(5, 60);
        System.out.println(v1);

        v1.removeElementAt(1);
        System.out.println(v1);

        Vector<Integer> v2 = new Vector<>();

        v2.add(100);
        v2.add(200);
        v2.add(300);

        System.out.println(v2);

        v1.addAll(v2);
        System.out.println(v1);

        System.out.println(v1.indexOf(30));

        System.out.println(v1.lastIndexOf(50));

        System.out.println(v1.set(1, 99));

        System.out.println(v1);

        System.out.println(v1.subList(1, 4));
    }
}