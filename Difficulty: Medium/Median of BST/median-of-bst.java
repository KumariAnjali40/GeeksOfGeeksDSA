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
    public int findMedian(Node root) {
        // Code here
        
        ArrayList<Integer> list = new ArrayList<>();
        
        getInOrder(root, list);
        
        int size = list.size();
        
       if(size % 2 == 0){
            return list.get((size/2)-1);
        }
        
        return list.get(size/2);
        
        
    }
    
    public static void getInOrder(Node node, ArrayList<Integer> list){
        
        if(node == null) return;
        
        getInOrder(node.left, list);
        
        list.add(node.data);
        
        getInOrder(node.right, list);
    }
}