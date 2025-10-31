import java.util.Arrays;

public class IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {
        System.out.println("Intersection of two linked lists:");
        Node headA = null;
        Node headB = null;

        Node common1 = new Node(2);
        Node common2 = new Node(3);
        Node common3 = new Node(4);
        Node common4 = new Node(5);

        headA = new Node(1);
        headA.setNext(common1);
        common1.setNext(common2);

        headB = new Node(4);
        headB.setNext(common3);
        common3.setNext(common4);
        common4.setNext(common1);
        common1.setNext(common2);


//        printList(headA);
//        printList(headB);
        Node intersectionNode = getIntersection(headA, headB);
        System.out.println("intersection node: " + intersectionNode.getData());
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println("data node: " +  current.getData());
            current = current.getNext();
        }
    }

    public static Node getIntersection(Node headA, Node headB) {
        int m = findLength(headA);
        int n = findLength(headB);

        Node fp = headA;
        Node sp = headB;
        if(m < n){
            int skip = n-m;
            for(int i = 0; i < skip; i++){
                sp = sp.getNext();
            }
        }else if(m > n){
            int skip = m-n;
            for(int i = 0; i < skip; i++){
                fp = fp.getNext();
            }
        }

        return findSameNode(fp, sp);
    }

    private static int findLength(Node head) {
        Node current = head;
        int length = 0;
        while (current != null) {
            length++;
            current = current.getNext();
        }
        return length;
    }

//    fp -> first pointer
//    sp -> second pointer
    private static Node findSameNode(Node fp, Node sp) {
        while (fp != null && sp != null) {
            if(fp == sp){
                return fp;
            }else{
                fp = fp.getNext();
                sp = sp.getNext();
            }
        }
        return null;
    }

}
