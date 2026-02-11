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
    List<List<Integer>> ans = new ArrayList<>();

    public int sumNumbers(TreeNode root) {
        int sum=0;
        List<Integer> lst=new ArrayList<>();
        getList(root,lst);
        for(List<Integer> row:ans){
            int number=0;
            for(Integer num:row){
                number=number*10+num;
           }
           sum+=number;
        }
        return sum;
    }

    private void getList(TreeNode node,List<Integer> lst){
        if(node==null) return ;

        lst.add(node.val);
        if(node.left==null&&node.right==null){
            ans.add(new ArrayList<>(lst));
        }
        getList(node.left,lst);
        
        getList(node.right,lst);

        lst.remove(lst.size()-1);
        
    }
}