/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    List<String> lst=new ArrayList<>();
    int i=0;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
         helper(root);
         return String.join(",", lst);
    }

    private void helper(TreeNode root){
        if(root==null)  {lst.add("null"); return ;}
        lst.add(String.valueOf(root.val));
        helper(root.left);
        helper(root.right);
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr=data.split(",");
        
        return helper2(arr);

        
    }

    private  TreeNode helper2(String[] arr){
        if(arr[i].equals("null")) {i++; return null;}
        TreeNode root=new TreeNode(Integer.parseInt(arr[i]));
        i++;
        root.left=helper2(arr);
        root.right=helper2(arr);

        return root;


    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));