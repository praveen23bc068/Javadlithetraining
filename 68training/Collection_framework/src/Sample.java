import java.util.TreeSet;

public class Sample {
        public static void main(String[] args){
            TreeSet<Integer>t=new TreeSet<>();
            t.add(10);
            t.add(20);
            t.add(30);
            t.add(140);
            System.out.println(t);
            System.out.println(t.first());
            System.out.println(t.last());
            System.out.println(t.headSet(25));
            System.out.println(t.tailSet(25));
            System.out.println(t.subSet(10,140));
            System.out.println(t.higher(10));
            System.out.println(t.lower(140));


        }
}
