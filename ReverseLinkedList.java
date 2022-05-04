public class ReverseLinkedList {

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            while (head != null) {
                ListNode temp = prev;
                prev = head;
                head = head.next;
                prev.next = temp;
            }
            return prev;
        }
    }
}
