package Head14_Data_Structure.example04_Deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(1);
        deque.addLast(2);
        deque.addLast(3);

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
    }
}
