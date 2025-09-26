
//DFS
//its postorder traversal

class Solution {
    int ans=Integer.MIN_VALUE; //keep track of maxpath sum found so far

    public int maxPathSum(TreeNode root) {
         helper(root);//helper ,method called recursively starting from root node to compute max path sum
         return ans; //final result 
    }
    int helper(TreeNode node){ //recursive method helper
        if(node==null){  //base condition
            return 0;
        }
        int left=helper(node.left); //recursively cal max path sum for left subtree
        int right=helper(node.right); //""""""""""for right subtree

        left=Math.max(0,left); //if sum is negative it'll not take it(reset it to 0 and if negative left<0 )
        right=Math.max(0,right);//""""""""

        int pathSum=left+right+node.val;//calculate sum of three

        ans=Math.max(ans,pathSum); //update  ans with max of its current val and pathSum

        return Math.max(left,right) + node.val; //used by parent node's computation
    }
}