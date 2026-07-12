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
    HashMap<Integer,Integer> mp=new HashMap<>();
    List<Integer> lst=new ArrayList<>();

    public int[] findMode(TreeNode root) {
        inorder(root);
        int max=Collections.max(mp.values());
        for(int key:mp.keySet()){
            if(mp.get(key)==max){
                lst.add(key);
            }
        }

        return  lst.stream().mapToInt(Integer::intValue).toArray();


        
    }
    private void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        mp.put(root.val,mp.getOrDefault(root.val,0)+1);
        inorder(root.right);
    }



}