import static java.lang.reflect.Array.get;

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

    public void insertLast(int value){
        if(tail == null){
            insertAtFirst(value);
            return;
        }

        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void insertAtPosition(int value, int index){
        if (index == 0){
            insertAtFirst(value);
        }
        if(index == size){
            insertLast(value);
        }

        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        Node newNode = new Node(value, temp.next); //calling diff constructor this time
        temp.next = newNode;
        size++;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
      if(size <= 1){
          deleteFirst();
      }
        int val = tail.value;
        Node secondlast = get(size - 2);
        tail = secondlast;

        tail.next = null;
        size--;
        return val;
    }

    private Node get(int i) {
        Node temp = head;

        for (int index = 0; index < i; index++) {
            temp = temp.next;
        }

        return temp;
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
