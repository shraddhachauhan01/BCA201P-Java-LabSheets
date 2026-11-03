import java.util.LinkedList;

public class Q08 {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<String>();
        queue.addFirst("Aman");
        queue.addLast("Riya");
        queue.addLast("Rahul");
        queue.addFirst("Priya");

        System.out.println("Queue: " + queue);
        System.out.println("Removed first: " + queue.removeFirst());
        System.out.println("Removed last: " + queue.removeLast());
        System.out.println("Updated queue: " + queue);
    }
}
