// Last updated: 7/14/2026, 2:15:52 PM
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        
        ListNode curr1 =list1;
        ListNode curr2 = list2;
        ListNode dummy = new ListNode();
        ListNode merged = dummy;

        while(curr1 != null && curr2 != null){
            if(curr1.val < curr2.val){
                merged.next = curr1;
                merged = curr1;
                curr1 = curr1.next;
            }
            else{
                merged.next = curr2;
                merged = curr2;
                curr2 = curr2.next;
            }
        }

        while(curr1 != null){
            merged.next = curr1;
            merged = curr1;
            curr1 = curr1.next;
        }
        while(curr2 != null){
            merged.next = curr2;
            merged = curr2;
            curr2 = curr2.next;
        }

        return dummy.next;
    }
}