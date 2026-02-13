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
    List<String> lst = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return lst;
        helper(root, "");
        return lst;
    }

    private void helper(TreeNode node, String path) {
        if (node == null) return;

        // Build current path
        if (path.isEmpty()) {
            path = String.valueOf(node.val);
        } else {
            path = path + "->" + node.val;
        }

        // If leaf node
        if (node.left == null && node.right == null) {
            lst.add(path);
            return;
        }

        helper(node.left, path);
        helper(node.right, path);
    }
}
