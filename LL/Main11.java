public class Main11 {
    public static void main(String[] args) {
        LL1 list = new LL1();
        list.insertAtFirst(3);
        list.insertAtFirst(8);
        list.insertAtFirst(17);
        list.insertAtFirst(5);

        list.insertLast(99);

        list.insertAtPosition(100, 3);

       System.out.println(list.deleteFirst());

       System.out.println(list.deleteLast());

       System.out.println(list.deleteAtPosition(1));

        list.display();

        list.find(3);
    }
}
