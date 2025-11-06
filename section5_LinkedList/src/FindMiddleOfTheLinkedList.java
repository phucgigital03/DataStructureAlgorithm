
public class FindMiddleOfTheLinkedList {
    public static void main(String[] args) {
        System.out.println("FindMiddleOfTheLinkedList");
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n6);

        Node rs = middleNode(n1);
        NodeCRUD.printList(rs);
    }

    public static Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;
        if(slow == null) {
            return null;
        }
        while (fast != null && fast.getNext() != null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return slow;
    }

}
