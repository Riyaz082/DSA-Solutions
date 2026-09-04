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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return null;
        }

        ListNode temp = head;
        int length = 1;
        while(true){
            if(temp.next == null){
                temp.next = head;
                break;
            }
            temp = temp.next;
            length++;
        }

        int i = 0;
        temp = head;
        k %= length;
        while(i < length - k - 1){
            temp = temp.next;
            i++;
        }
        head = temp.next;
        temp.next = null;

        return head; 
    }
}