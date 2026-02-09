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
    int maxi=0;
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        height(root);
        return maxi;
    }
    private int height(TreeNode node){
         if(node==null) return 0;
         int h= Math.max(height(node.left),height(node.right))+1;
         maxi=Math.max(maxi,h);
         return h;

    }
}