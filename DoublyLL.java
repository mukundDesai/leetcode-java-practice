public class DoublyLL {

    private Node head;
    private Node tail;

    private int size = 0;

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        node.prev = tail;
        tail.next = node;
        tail = node;
        size++;
    }

    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        head.prev = null;
        size--;
        return value;
    }

    public int deleteLast() {
        int value = tail.value;
        tail = tail.prev;
        tail.next = null;
        size--;
        return value;
    }

    public void insertAt(int index, int value) {
        Node node = new Node(value);
        if (size / 2 > index) {
            while (--index > 0) {
                node = node.next;
            }

        }
    }

    public int get(int index) {
        Node node = head;
        while (--index > 0) {
            node = node.next;
        }
        return node.value;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayReverse() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            last = temp;
            temp = temp.next;
        }
        while (last != null) {
            System.out.print(last.value + "->");
            last = last.prev;
        }
        System.out.println("START");
    }

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        // public Node(int value, Node next, Node prev) {
        // this.value = value;
        // this.next = next;
        // this.prev = prev;
        // }
    }
}
