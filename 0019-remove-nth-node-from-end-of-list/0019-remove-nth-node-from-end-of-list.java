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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;


        for(int i = 0 ; i<n ; i++){
            fast = fast.next;
        }

        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;

        }

        slow.next = slow.next.next;

        return dummy.next;


// int count =0;
//         ListNode temp = head;
//         while(temp!=null){
//             count++;
//             temp = temp.next;
//         }

//         if(head==null)return head;

//         if(count == n)return head.next;

//         temp = head;

//         int res = count - n;
//         while(temp!=null){

//             res--;

//             if(res==0){
//                 temp.next=temp.next.next;
//             }
//         }

// return head;
    }


}