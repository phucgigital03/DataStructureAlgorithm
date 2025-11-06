

public class RemoveNthFromEndOfList {
    public static void main(String[] args) {
        System.out.println("RemoveNthFromEndOfList");
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);

        NodeCRUD.printList(n1);
        n1 = removeNthFromEnd(n1, 7);
        NodeCRUD.printList(n1);
    }

    public static Node removeNthFromEnd(Node head, int n) {
        if(head == null) return null;

        Node slow = head;
        Node fast = head;
        int count = 0;

        for (int i = 0; i < n + 1; i++) {
            if(fast == null) {
                break;
            }
            fast = fast.getNext();
            count++;
        }

        if(count == n + 1) {
            while (fast != null) {
                slow = slow.getNext();
                fast = fast.getNext();
            }
            slow.setNext(slow.getNext().getNext());
        }else{
            head = head.getNext();
        }
        return head;
    }
}
