/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution {
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root, int k) {
        // Your code here
         Stack<Node> st = new Stack<>();
        Node curr = root;
        int count = 0;

        while (curr != null || !st.isEmpty()) {
            while (curr != null) {
                st.push(curr);
                curr = curr.right;
            }

            curr = st.pop();
            count++;
            if (count == k) {
                return curr.data;
            }

            curr = curr.left;
        }

        return -1; 
    }
}