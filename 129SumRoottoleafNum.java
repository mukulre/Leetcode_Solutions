/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int totalsum=0;

    public int sumRootLeaf(TreeNode root,int digit,int temp) {
         if(root == null ){
            return totalsum;
        }

        temp=digit;
        digit =(digit * 10) + root.val;

        //leaf node 
        if(root.left == null && root.right == null){
            totalsum+=digit;
        }
        else { //normal
             if(root.left !=null){sumRootLeaf(root.left, digit, temp);}
             if(root.right != null){sumRootLeaf(root.right,digit,temp);}
        }

        digit=temp;

        return totalsum;
    }

    public int sumNumbers(TreeNode root) {
        int digit=0; //forming the digit
        int temp=0;  //maintaining the digits 
         if(root == null ){
            return totalsum;
        }

        return sumRootLeaf(root,digit,temp);
    }
}

/*
***given :- 1. root node of the binary tree [tree can have 0 , 1 or 2 child]
            2. number values present for the node are from 0 to the 9.
*** output :- sum of nodes from which formed by traversing from root to leaf nodes values i.e digits
*** Tasks :- 1. traversed tree from root to leaf in (DFS) order 
             2. if node is not the leaf then form the digit 
             3. if node is leaf node then and node value into the total sum amount.
 */