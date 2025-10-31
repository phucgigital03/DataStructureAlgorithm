import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        System.out.println("Palindrome linked list");
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(7);
        Node n4 = new Node(9);
        Node n5 = new Node(7);
        Node n6 = new Node(3);
        Node n7 = new Node(2);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n6);
//        n6.setNext(n7);

        System.out.println("Linked list is palindrome: " + isPalindrome(n1));
    }

    public static boolean isPalindrome(Node head) {
        Queue<Node> queue = new LinkedList<Node>();
        Node current = head;
        while (current != null) {
            queue.add(current);
            current = current.getNext();
        }

        Node reversed = reverseList(head);
        current = reversed;
        while (current != null) {
            if(current.getData() != queue.remove().getData()) {
                return false;
            }
            current = current.getNext();
        }
        return true;
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
}
