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
    public boolean isSymmetric(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(root.left);
        que.offer(root.right);
        while(!que.isEmpty()){
            
            TreeNode node1=que.poll();
            TreeNode node2=que.poll();
            if(node1==null&& node2==null) continue;
            if(node1==null || node2==null) return false;
            
            if(node1.val!=node2.val) return false;
         
            que.offer(node1.left);
            que.offer(node2.right);
            que.offer(node1.right);
            que.offer(node2.left);

            

        }
        return true;
    }
}