import java.util.LinkedList;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        System.out.println("Merge Two Lists:");
//        LinkedList<Integer> ll = new LinkedList<>();
//        ll.add(2);
//        ll.add(4);
//        ll.add(5);
//        LinkedList<Integer> ll2 = new LinkedList<>();
//        ll2.add(3);
//        ll2.add(6);
//        ll2.add(10);
//        ll2.add(12);

        Node ll = null;
        ll = NodeCRUD.insertNodeAtFront(ll, 9);
        ll = NodeCRUD.insertNodeAtFront(ll, 5);
        ll = NodeCRUD.insertNodeAtFront(ll, 2);

        Node ll2 = null;
        ll2 = NodeCRUD.insertNodeAtFront(ll2, 100);
        ll2 = NodeCRUD.insertNodeAtFront(ll2, 10);
        ll2 = NodeCRUD.insertNodeAtFront(ll2, 9);
        ll2 = NodeCRUD.insertNodeAtFront(ll2, 3);
        ll2 = NodeCRUD.insertNodeAtFront(ll2, 2);

        Node merged = mergeTwoLists(ll,ll2);
        NodeCRUD.printList(merged);
    }

//    1. loop both headA and headB
//    2. if both are null, and then break
//    3. if either of them is null, copy other blindly
//    4. if both are not null, compare them
//          - node 1 <= node 2, copy node 1 into output list
//          - node 1 > node 2, copy node 2 into output list
//          - node 1 == node 2, copy either of them
    private static Node mergeTwoLists(Node headA, Node headB) {
        Node out = null;
        Node tail = null;
        while(!(headA == null && headB == null)){
            if(headA == null){
                if(out == null){
                    out = headB;
                    tail = headB;
                }else{
                    tail.setNext(headB);
                    tail = headB;
                }
                headB = headB.getNext();
            }else if(headB == null){
                if(out == null){
                    out = headA;
                    tail = headA;
                }else{
                    tail.setNext(headA);
                    tail = headA;
                }
                headA = headA.getNext();
            }else{
                if(headA.getData() <= headB.getData()){
                    if(out == null){
                        out = headA;
                        tail = headA;
                    }else{
                        tail.setNext(headA);
                        tail = headA;
                    }
                    headA = headA.getNext();
                }else if(headA.getData() > headB.getData()){
                    if(out == null){
                        out = headB;
                        tail = headB;
                    }else{
                        tail.setNext(headB);
                        tail = headB;
                    }
                    headB = headB.getNext();
                }
            }

        }

        return out;
    }


}
