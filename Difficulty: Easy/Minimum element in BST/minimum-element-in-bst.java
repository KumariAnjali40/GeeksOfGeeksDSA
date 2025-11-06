/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    public int minValue(Node root) {
        // code here
        Node curr = root;
        if(curr.left == null) return curr.data;
        
        return minValue(curr.left);
    }
}