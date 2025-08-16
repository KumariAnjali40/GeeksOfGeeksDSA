/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        
        if (head.next == null)
            return null;
        
        Node curr = head;
        Node temp = head;
        
        int length = 0;
        while(curr != null) {
            length++;
            curr = curr.next;
        }
        
        int midIndex = length/2;
        
        
        
        for(int i = 0; i < midIndex-1; i++){
            temp = temp.next;
        }
        
        temp.next = temp.next.next;
        
        return head;
        
        

    }
}