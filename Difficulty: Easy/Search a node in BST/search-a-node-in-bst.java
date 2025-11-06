/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public boolean search(Node root, int key) {
        // code here
        boolean ans = searchInBST(root, key);
        
        return ans;
    }
    
    public static boolean searchInBST(Node node, int key){
        
        if(node == null) return false;
        
        if(node.data == key) return true;
        
        if(key > node.data){
          return searchInBST(node.right, key);
        }
        
        return searchInBST(node.left, key);
    }
}