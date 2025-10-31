

public class ReverseLinkedList {
    public static void main(String[] args) {
        System.out.println("Reverse Linked List");
        Node n1 = new Node(1);
        Node n2 = new Node(5);
        Node n3 = new Node(3);
        Node n4 = new Node(9);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);

        NodeCRUD.printList(n1);
        n1 = reverseList(n1);
        NodeCRUD.printList(n1);
//        System.out.println("Value of tail node: " + getTail(n1).getData());

    }

    public static Node reverseList(Node head) {
        Node curr = head;
        Node prev = null;
        Node output = head;
        while(curr != null) {
            curr = curr.getNext();
            output.setNext(prev);
            prev = output;
            if(curr != null){
                output = curr;
            }
        }
        return output;
    }

    public static Node getTail(Node head) {
        Node curr = head;
        Node tail = null;
        while (curr != null){
            tail = curr;
            curr = curr.getNext();
        }
        return tail;
    }
}
