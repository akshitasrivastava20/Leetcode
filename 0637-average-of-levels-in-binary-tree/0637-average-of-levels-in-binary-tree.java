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
    public List<Double> averageOfLevels(TreeNode root) {
       
        List<Double> lst=new ArrayList<>();
         if(root==null) return lst;
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            long avg=0;
            int levelsize=que.size();
            for(int i=0;i<levelsize;i++){
                TreeNode curr=que.poll();
                avg+=curr.val;
                if(curr.left!=null) que.offer(curr.left);
                if(curr.right!=null) que.offer(curr.right);
            }
            lst.add(avg/(double)levelsize);
        }
        return lst;
    }
}