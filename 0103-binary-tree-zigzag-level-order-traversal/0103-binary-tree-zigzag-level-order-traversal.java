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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      List<List<Integer>> result=new ArrayList<>(); 
      if(root==null) return result;
      Deque<TreeNode> deq=new LinkedList<>();  
      boolean rev=false;
      deq.offerFirst(root);
      while(!deq.isEmpty()){
        int levelsize=deq.size();
        List<Integer> lst=new ArrayList<>();
        if(!rev){
        for(int i=0;i<levelsize;i++){
           TreeNode curr=deq.pollFirst();
           lst.add(curr.val);
           if(curr.left!=null) deq.offerLast(curr.left);
           if(curr.right!=null) deq.offerLast(curr.right);
           rev=true;

        }}
        else{
           for(int i=0;i<levelsize;i++){
           TreeNode curr=deq.pollLast();
           lst.add(curr.val);
           if(curr.right!=null) deq.offerFirst(curr.right);
           if(curr.left!=null) deq.offerFirst(curr.left);
           rev=false;

        }  
        }
        result.add(lst);
      }
      return result;
    }
}