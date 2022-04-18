public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertAt(int index, int value) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }
        Node node = head;
        while (index > 0) {
            node = node.next;
            index--;
        }

        Node newNode = new Node(value, node.next);
        node.next = newNode;
        size++;
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    public int deleteLast() {
        int value = tail.value;
        Node temp = head;
        int s = size;
        while (s - 2 != 0) {
            temp = temp.next;
            s--;
        }
        tail = temp;
        tail.next = null;
        size--;
        return value;
    }

    public int deleteAt(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size) {
            return deleteLast();
        }
        Node temp1 = head;
        while (--index > 0) {
            temp1 = temp1.next;
        }
        Node temp2 = temp1.next;
        int value = temp2.value;
        temp1.next = temp2.next;
        size--;
        return value;
    }

    public int get(int index) {
        Node temp = head;
        if (index == 0) {
            return head.value;
        }
        if (index == size - 1) {
            return tail.value;
        }
        while (index-- > 0) {
            temp = temp.next;
        }
        return temp.value;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
