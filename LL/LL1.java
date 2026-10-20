public class LL1 {

    //every linked list has a head and a tail::
    private Node head;
    private Node tail;

    private int size; //size of linkedlist

    public LL1(){
        this.size = 0;
    }

    public void insertAtFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println("END!");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }//if this node is not pointing to any other node

        public Node(int value, Node next){
            this.value = value;
            this.next = next; //2 nodes ko link karega
        }
    }
}
