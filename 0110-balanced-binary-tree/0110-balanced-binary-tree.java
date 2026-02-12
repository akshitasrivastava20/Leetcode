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
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        
        return isBalanced(root.left)&&isBalanced(root.right)&&height(root.left)-height(root.right)>=-1&&height(root.left)-height(root.right)<=1;

    }
    private int height(TreeNode node){
        if(node==null) return 0;
       return Math.max(height(node.left),height(node.right))+1;
    }
}