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
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx=findNode(root,x);
        TreeNode yy=findNode(root,y);
         return (level(root,xx,0)==level(root,yy,0) && (!isSiblings(root,xx,yy)));

    }
    private TreeNode findNode(TreeNode root,int x){
        if(root==null) return root;
        if(root.val==x) return root;
        TreeNode node=findNode(root.left,x);
        if(node!=null) return node;
        node=findNode(root.right,x);
        return node;

    }

    private int level(TreeNode root,TreeNode node,int l){
        if(root==null) return 0;
        if(root==node) return l;
        int lev=level(root.left,node,l+1);
        if(lev!=0) return lev;
        lev=level(root.right,node,l+1);
        return lev;
    }

    private boolean isSiblings(TreeNode root,TreeNode xx,TreeNode yy){
        if(root==null) return false;
        return ((root.left==xx&& root.right==yy)||(root.left==yy&& root.right==xx)||(isSiblings(root.left,xx,yy))||(isSiblings(root.right,xx,yy)));
    }

}