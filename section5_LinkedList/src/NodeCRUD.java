public class NodeCRUD {
    public static void main(String[] args) {
        Node head = null;
        head = insertNodeAtFront(head, 5);
        head = insertNodeAtFront(head, 10);
        head = insertNodeAtFront(head, 15);
        head = insertNodeAtFront(head, 20);
        head = insertNodeAtFront(head, 25);

        printList(head);

        head = deleteNodeAtFront(head);
        printList(head);
        head = deleteNodeAtFront(head);
        printList(head);

//        Node tNode = new Node(1);
//        System.out.println("value: " + tNode.getData());
//        editTest(tNode);
//        System.out.println("value after editing: " + tNode.getData());
    }

    public static void editTest(Node n) {
        n.setData(5);
    }

    public static Node insertNodeAtFront(Node head,int data){
        Node newNode = new Node(data);
        if(head == null){
            newNode.setNext(null);
            head = newNode;
        }else{
            newNode.setNext(head);
            head = newNode;
        }
        return head;
    }

    public static Node deleteNodeAtFront(Node head){
        if(head == null){
            return null;
        }else{
            head = head.getNext();
            return head;
        }
    }

    public static void printList(Node head){
        Node current = head;
        if(current == null){
            return;
        }
        System.out.println("print list of node: ");
        while(current != null){
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

}
