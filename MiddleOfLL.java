public class MiddleOfLL {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int size = 1;
        while (temp.next != null) {
            temp = temp.next;
            size++;
        }
        int middle = size / 2;
        while (middle-- > 0) {
            head = head.next;
        }
        return head;
    }
}
