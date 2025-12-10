package practice;

import _0_commons.ListNode;

public class Practice {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast n+1 steps so slow lands right before the target
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move together until fast hits the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove node
        slow.next = slow.next.next;

        return dummy.next;
    }


}
