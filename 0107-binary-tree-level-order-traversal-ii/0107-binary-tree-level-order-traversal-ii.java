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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            int levelsize=que.size();
            List<Integer> lst=new ArrayList<>();
            for(int i=0;i<levelsize;i++){
                TreeNode curr=que.poll();
                lst.add(curr.val);
                if(curr.left!=null) que.offer(curr.left);
                if(curr.right!=null) que.offer(curr.right);
            }
            result.add(0,lst);
        }
       
        return result;
    }
}