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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        ArrayList<Integer> res=new ArrayList<>();
        while(temp!=null)
        {
            res.add(temp.val);
            temp=temp.next;

        }
        int i=0;
        int j=res.size()-1;
        while(i<j)
        {
            if(!res.get(i).equals(res.get(j)))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}