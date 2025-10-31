import java.util.HashSet;

public class LinkedListCycle {

    public static void main(String[] args) {
        System.out.println("Linked List Cycle");
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        Node head = n1;
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n2);

        System.out.println("Check Linked List Cycle: " + hasCycle(head));

    }

    public static boolean hasCycle(Node head) {
        HashSet<Node> set = new HashSet<>();
        Node cur = head;
        while (cur != null) {
            if (set.contains(cur)) {
                return true;
            }else{
                set.add(cur);
            }
            cur = cur.getNext();
        }
        return false;
    }

    public static boolean hasCycle2(Node head) {
        return false;
    }


}
