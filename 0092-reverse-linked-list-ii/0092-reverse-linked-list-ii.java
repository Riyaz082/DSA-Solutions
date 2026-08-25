/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right){
            return head;
        }

        ListNode before = null, temp = head;
        int pos = 1;
        while(pos < left){
            before = temp;
            temp = temp.next;
            pos++;
        }

        ListNode curr = temp, prev = null, next = null;
        int times = right - left + 1;

        int i =0;
        while(i < times){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            i++;
        }

        temp.next = curr;
        if(before != null){
            before.next = prev;
            return head;
        }
        return prev;
    }
}