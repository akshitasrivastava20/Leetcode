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
    List<List<Integer>> ans=new ArrayList<>();
    Queue<TreeNode> que=new LinkedList<>();


    public List<List<Integer>> levelOrder(TreeNode root) {

        levelise(root);
        return ans;
        
    }
    private void levelise(TreeNode node){
        if(node==null) return;
        que.offer(node);
        while(!que.isEmpty()){
            int levelsize=que.size();
            List<Integer> lst=new ArrayList<>();
            for(int i=0;i<levelsize;i++){
                TreeNode ele=que.poll();
                lst.add(ele.val);
                if(ele.left!=null) que.offer(ele.left);
                if(ele.right!=null) que.offer(ele.right);

            }
            ans.add(lst);



        }

    

    }
}