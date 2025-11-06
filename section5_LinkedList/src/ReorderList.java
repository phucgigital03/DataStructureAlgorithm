
public class ReorderList {
    public static void main(String[] args) {
        System.out.println("ReorderList");
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);

        reorderList(n1);
        NodeCRUD.printList(n1);
    }

    public static void reorderList(Node head) {
        if (head == null || head.getNext() == null) {
            return;
        }
        Node l1 = head;
        Node l2 = null;
        Node sp = head;
        Node fp = head;
        Node prev = null;
        while (fp != null && fp.getNext() != null) {
            prev = sp;
            sp = sp.getNext();
            fp = fp.getNext().getNext();
        }

        if(fp == null){
            prev.setNext(null);
        }else{
            prev.setNext(sp);
            sp = sp.getNext();
            prev.getNext().setNext(null);
        }
        l2 = ReverseLinkedList.reverseList(sp);

        NodeCRUD.printList(l1);
        NodeCRUD.printList(l2);

//        case 1:
//        1->2->3->null
//        5->4->null

//        case 2:
//        1->2->null
//        4->3->null
        Node move1 = l1;
        Node move2 = l2;
        while(true){
            if(l1 == null || l2 == null){
                break;
            }
            l1 = l1.getNext();
            l2 = l2.getNext();
            move1.setNext(move2);
            move2.setNext(l1);
            move1 = l1;
            move2 = l2;
        }

    }
}
