public class DLL {
    Node head;

    public void insertFirst(int value){
        Node newNode = new Node(value);

        newNode.next = head;
        if(head != null) {
            head.prev = newNode;
        }
        head = newNode;
        newNode.prev = null;
    }

    public void display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.value + "->");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END"); //System.out.println(); --> prints a new line
        //by the end of above while loop Node last will point to the last not DLL

        System.out.println("Linked List in reverse");
        while(last != null){
            System.out.print(last.value + "->");
            last = last.prev;
        }
        System.out.println("Start");
    }

    //in DLL we have reversal too

    public void insertLast(int value){
        Node newNode = new Node(value);
        Node last = head;

        if(head == null){
            newNode.prev = null;
            head = newNode;
            return;
        }

        while(last.next != null){
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }

    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
