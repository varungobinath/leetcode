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
        if(k==0) return head;
        if(head==null || head.next==null) return head;
        int size = Length(head);
        k%=size;
        k = size-1-k;
        ListNode tail = head;
        while(tail.next!=null) tail = tail.next;
        tail.next = head;
        
        ListNode cur = head;
        for(int i=0;i<k;i++)
            cur = cur.next;
        tail = cur;
        head = cur.next;
        tail.next = null;
        return head;
    }
    public static int Length(ListNode head){
        int size = 0;
        while(head!=null){
            head = head.next;
            size++;
        }
        return size;
    }
}