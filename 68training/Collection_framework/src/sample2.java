import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class sample2 {
    public static void main(String[] args){
        PriorityQueue<String>pq=new PriorityQueue<>();
        pq.offer("NSAM");
        pq.offer("Nitte");
        pq.offer("NMAIT");
        pq.offer("Mangalore");
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.printf(pq.poll());
        System.out.println(pq.element());
        System.out.println(pq.remove("Nitte"));

        ArrayDeque<String>dq=new ArrayDeque<>();
        dq.offer("NSAM");
        dq.offerFirst("Nitte");
        dq.offerLast("NMAIT");
        dq.offer("Mangalore");
        System.out.println(dq);

    }
}
