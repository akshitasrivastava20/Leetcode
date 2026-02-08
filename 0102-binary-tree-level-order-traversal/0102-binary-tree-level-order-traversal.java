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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> result=new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            int levelsize=que.size();
            List<Integer> lst=new ArrayList<>();
            for(int i=0;i<levelsize;i++){
                TreeNode node=que.poll();
                lst.add(node.val);
                if(node.left!=null) que.offer(node.left);
                if(node.right!=null) que.offer(node.right);
            }
            result.add(lst);
        }
        return result;
    }
}