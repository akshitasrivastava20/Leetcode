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
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        sumleft(root,false);
        return sum;
    }
    private void sumleft(TreeNode node,boolean isLeft){
        if(node==null) return;
        if(isLeft==true&&node.left==null&&node.right==null){
            sum+=node.val;
            return;
        }
        sumleft(node.left,true);
        sumleft(node.right,false);

    }

}