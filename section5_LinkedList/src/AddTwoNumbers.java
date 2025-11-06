
public class AddTwoNumbers {
    public static void main(String[] args) {
        System.out.println("AddTwoNumbers");
        Node l1_1 = new Node(2);
        Node l1_2 = new Node(4);
        Node l1_3 = new Node(3);

        Node l2_1 = new Node(5);
        Node l2_2 = new Node(6);
        Node l2_3 = new Node(4);

        l1_1.setNext(l1_2);
        l1_2.setNext(l1_3);

        l2_1.setNext(l2_2);
        l2_2.setNext(l2_3);

        Node out = addTwoNumbers(l1_1,l2_1);
        NodeCRUD.printList(out);


    }

//        1. iterate both linked list check each ele
//                a. both ele are not null, sum normally
//                b. either of them is null, do calculate other
//                that is not null with ele equal = 0 (other + 0)
//                c. both ele are null, stop
//        ***note: keep an eye on "carry" variable when stop
    public static Node addTwoNumbers(Node l1,Node l2) {
        Node out = null;
        Node tail = null;
        Node temp1 = l1;
        Node temp2 = l2;
        int carry = 0;

        while(temp1 != null || temp2 != null){
            if(temp1 != null && temp2 != null){
                int sum = temp1.getData() + temp2.getData() + carry;
                if(sum / 10 == 0){
                    sum = sum;
                    carry = 0;
                }else{
                    sum = sum % 10;
                    carry = 1;
                }
                Node newNode = new Node(sum);

                if(out == null){
                    out = newNode;
                    tail = newNode;
                }else{
                    tail.setNext(newNode);
                    tail = tail.getNext();
                }

            }else if(temp1 == null){
                int sum = temp2.getData() + carry;
                if(sum / 10 == 0){
                    carry = 0;
                }else{
                    sum = sum % 10;
                    carry = 1;
                }
                Node newNode = new Node(sum);

                if(out == null){
                    out = newNode;
                    tail = newNode;
                }else{
                    tail.setNext(newNode);
                    tail = tail.getNext();
                }

            }else{
                int sum = temp1.getData() + carry;
                if(sum / 10 == 0){
                    carry = 0;
                }else{
                    sum = sum % 10;
                    carry = 1;
                }
                Node newNode = new Node(sum);

                if(out == null){
                    out = newNode;
                    tail = newNode;
                }else{
                    tail.setNext(newNode);
                    tail = tail.getNext();
                }
            }

            if(temp1 != null){
                temp1 = temp1.getNext();
            }
            if(temp2 != null){
                temp2 = temp2.getNext();
            }
        }

        if(carry > 0){
            Node newNode = new Node(carry);
            tail.setNext(newNode);
            tail = tail.getNext();
        }
        return out;
    }

}
