// Link: https://leetcode.com/problems/linked-list-cycle/description/

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) {
            return false;
        }

        if(head.next == null) {
            return false;
        }

        ListNode cur = head;
        ListNode next = head;
        while(cur != null && cur.next != null) {
            cur = cur.next.next;
            next = next.next;
            if(cur == next) {
                return true;
            }
        }

        return false;
    }
}