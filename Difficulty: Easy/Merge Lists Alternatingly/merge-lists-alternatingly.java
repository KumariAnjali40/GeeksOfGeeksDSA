/*
The structure of node class is :
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public Node[] mergeList(Node head1, Node head2) {
        // write your code here, and print the result
        
        Node curr1 = head1;
        Node curr2 = head2;
        
        while(curr1 != null && curr2 != null){
            Node pt1 = curr1.next;
            Node pt2 = curr2.next;
            
            curr1.next = curr2;
            curr2.next = pt1;
            
            curr1 = pt1;
            curr2 = pt2;
        }
        
        return new Node[]{head1, curr2};
    }
}