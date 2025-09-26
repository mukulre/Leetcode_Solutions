class Solution {
    List<Integer> list = new ArrayList<>();
    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
   public TreeNode createBST(List<Integer> list, int x, int y) {
    if (x > y) { 
        return null;
    }
    int mid = (x + y) / 2;
    TreeNode root = new TreeNode(list.get(mid));
    root.left = createBST(list, x, mid - 1); 
    root.right = createBST(list, mid + 1, y); 
    return root; 
}

    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        TreeNode newnode = createBST(list, 0 ,list.size()-1);
        return newnode;
    }
}