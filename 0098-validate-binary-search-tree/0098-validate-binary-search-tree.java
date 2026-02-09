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
    public boolean isValidBST(TreeNode root) {
         
          return check(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    private boolean check(TreeNode node,long l,long h){
        if(node==null) return true;
        
        if(node.val<=l) return false;
        if(node.val>=h) return false;
        
         boolean left=check(node.left,l,node.val);
           
         boolean right=check(node.right,node.val,h);
         return left&&right;
       
        
    }
}