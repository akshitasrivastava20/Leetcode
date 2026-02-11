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
    int globalmax=Integer.MIN_VALUE;;
    public int maxPathSum(TreeNode root) {
        int sum=pathsum(root);
        return globalmax;
    }
    private int pathsum(TreeNode root){
        if(root==null) return 0;
        int left=Math.max(0,pathsum(root.left));
        int right=Math.max(0,pathsum(root.right));
        
        int curr=left+right+root.val;
        globalmax=Math.max(globalmax,curr);

        return Math.max(left,right)+root.val;
    }
}