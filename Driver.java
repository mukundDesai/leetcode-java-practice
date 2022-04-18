// import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(6);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(7);
        list.insertLast(70);
        list.insertAt(4, 213);
        System.out.println();
        list.display();
        System.out.println();
        System.out.println(list.deleteFirst());
        System.out.println();
        list.display();
        System.out.println();
        System.out.println(list.deleteLast());
        System.out.println();
        list.display();
        System.out.println();
        System.out.println(list.deleteAt(4));
        System.out.println();
        list.display();
        System.out.println();
        System.out.println(list.get(2));
    }
}
