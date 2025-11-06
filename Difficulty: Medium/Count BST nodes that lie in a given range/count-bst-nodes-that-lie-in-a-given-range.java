/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/
class Solution {
    int getCount(Node root, int l, int h) {
        // Your code here
        int ans = getBSTCount(root, l, h);
        
        return ans;
    }
    
    public static int getBSTCount(Node node, int low, int high){
        
        if(node == null) return 0;
        
        if(node.data <= high && node.data >= low){
            return 1+getBSTCount(node.left, low, high)+getBSTCount(node.right,low,high);
        }else if(node.data < low){
            return getBSTCount(node.right, low, high);
        } else {
            return getBSTCount(node.left, low, high);
        }
        
        
        
    }
}