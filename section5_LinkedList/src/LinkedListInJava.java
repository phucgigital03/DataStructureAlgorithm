import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListInJava {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(5);
        ll.add(2);
        ll.add(3);

        ll.remove(Integer.valueOf(2));
        ll.remove(1);

        System.out.println("check contain: " + ll.contains(4));

        Iterator<Integer> iterator = ll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
