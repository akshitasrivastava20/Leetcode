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
    public void flatten(TreeNode root) {
        if(root==null) return;
        if(root.left!=null){
                if(root.right!=null){
                TreeNode rightmost=findRightmost(root.left);
                rightmost.right=root.right;}
                
                root.right=root.left;
                root.left=null;
               

            
        }
        flatten(root.right);

    }
    private TreeNode findRightmost(TreeNode node){
        
            while(node.right!=null){
                node=node.right;
            }
            return node;
        
    }
}