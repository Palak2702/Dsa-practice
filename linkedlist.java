import java.util.*;
class Node {
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
class Solution
{
    public static Node reverse(Node head, int k)
    {
        //Your code here
        if(head ==null || head.next==null)
        return head;
        
        Node curr = head ; Node nxt = null ;Node prev = null;
        int count = 0;
        
        while(count<k&&curr!=null){
            nxt = curr.next;
            curr.next=prev;
            prev=curr;
            curr = nxt;
            count++;
           
        }
        if(nxt!=null){
            head.next = reverse(nxt,k);
        }
        return prev;
    }
       
}

