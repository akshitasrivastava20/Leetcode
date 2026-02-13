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
    List<Integer> lst=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null) return lst;
        preorder(root);
        return lst;
        

    }
    private void preorder(TreeNode node){
        if(node==null) return;
        lst.add(node.val);
        preorder(node.left);
        preorder(node.right);
        
    }
}