/*
class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        
        Stack <Integer> stack = new Stack<>();
        
        Node temp = head;
        
        while(temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }
        
        temp = head;
        
        while(temp != null){
            temp.data = stack.pop();
            temp = temp.next;
        
        }
        
        return head;
    }
}