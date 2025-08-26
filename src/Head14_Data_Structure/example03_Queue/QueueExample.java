package Head14_Data_Structure.example03_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> q =  new LinkedList<String>();

        q.offer("A"); //add
        q.offer("B");

        System.out.println(q.poll()); //remove
        System.out.println(q.peek());
    }
}
