/* Node is defined as
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {
    // Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head) {
        // code here
        HashSet<Node> set = new HashSet<>();
        
        while( head != null){
            if(set.contains(head)){
                return true;
            }
            
            set.add(head);
            
            head = head.next;
        }
        
        return false;
    }
}