/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node> q = new LinkedList<>();
        if (root == null ) return root;
        q.offer(root);
        while(!q.isEmpty()){
            int level = q.size();
            for(int i =0; i< level; i++){
                Node cur = q.poll();
                if (cur.left != null && cur.right !=null) {
                    q.offer(cur.left);
                    q.offer(cur.right);
                }
                
                if (q.isEmpty() || i == level -1)
                    cur.next = null;
                else
                    cur.next = q.peek();
            }

        }
        return root;
}
}