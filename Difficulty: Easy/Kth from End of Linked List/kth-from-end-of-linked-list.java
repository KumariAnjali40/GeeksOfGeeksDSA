/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        // Node curr = head;
        
        // int length = 0;
        // while (curr != null){
        //     curr = curr.next;
        //     length++;
        // }
        
        // Node temp = head;
        
        // if(k > length){
        //     return -1;
        // } else {
        //     for( int i = 0; i < length-k ; i++){
        //         temp = temp.next;
        //     }
        // }
        
        // return temp.data;

        Node mainPt = head;
        Node refPt = head;
        
        for(int i = 1; i < k; i++) {
            
            refPt = refPt.next;
            
            if(refPt == null){
                return -1;
            }
        }
        
        while(refPt.next != null){
            refPt = refPt.next;
            mainPt = mainPt.next;
        }
        
        return mainPt.data;
        
    }
}
