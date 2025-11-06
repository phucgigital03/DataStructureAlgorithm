
public class LinkedListCycleVersion2 {
    public static void main(String[] args) {
        System.out.println("LinkedListCycleVersion2");
        Node n1 = new Node(3);
        Node n2 = new Node(2);
        Node n3 = new Node(0);
        Node n4 = new Node(4);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n1);

        System.out.println("Result: " + detectCycle(n1).getData());
    }

    public static Node detectCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (true) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if(slow == null || fast == null || fast.getNext() == null) return null;
            if(slow == fast) {
                Node third = head;
                while (third != fast) {
                    third = third.getNext();
                    fast = fast.getNext();
                }
                return third;
            }
        }
    }

}
