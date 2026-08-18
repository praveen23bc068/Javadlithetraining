package list;

import java.util.LinkedList;

public class sample1 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        list.addFirst(5);
        System.out.println(list);

        list.addLast(60);
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}