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
    public ListNode middleNode(ListNode head) {
        int cout = count(head)/2;
        while(cout > 0){
            head = head.next;
            cout--;
        }
        return head;

    }
    public int count(ListNode head){
        int count = 0;
        while(head != null){
            head = head.next;
            count ++;
        }
        return count;
    }
    
}