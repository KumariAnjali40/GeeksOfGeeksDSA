/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    int getMiddle(Node head) {
        // Your code here.
        
       //  Node curr = head;
        
       //  int length = 0;
        
       //  while(curr != null){
       //      curr = curr.next;
       //      length++;
       //  }
        
       //  Node temp = head;
        
       // for(int i = 0; i < length/2; i++){
       //     temp = temp.next;
       // }
       
       // return temp.data;

         Node slow = head;
      Node fast = head;
      
      while(fast !=null && fast.next!=null){
          slow = slow.next;
          fast = fast.next.next;
      }
      
      return slow.data;
    }
}
