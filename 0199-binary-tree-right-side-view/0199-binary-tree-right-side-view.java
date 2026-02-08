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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> lst=new ArrayList<>();
        if(root==null) return lst;
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            TreeNode rightmost=null;
            int levelsize=que.size();
            for(int i=0;i<levelsize;i++){
                rightmost=que.poll();
                if(rightmost.left!=null) que.offer(rightmost.left);
                if(rightmost.right!=null) que.offer(rightmost.right);

            }
            lst.add(rightmost.val);
        }
        return lst;
    }
}