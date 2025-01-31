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
    public TreeNode bstFromPreorder(int[] preOrder) {
        // First Node of preOrder array is root.
        TreeNode root = new TreeNode(preOrder[0]);

        // Insert each node.
        for(int i = 1; i < preOrder.length; i++){
            insertNode(root,preOrder[i]);
        }

        return root;
    }

    TreeNode insertNode(TreeNode root, int val){
        if(root == null){
            return new TreeNode(val);
        }

        if(root.val > val){
            TreeNode newNode = insertNode(root.left,val);
            root.left = newNode;
        }
            
        else{
            TreeNode newNode = insertNode(root.right,val);
            root.right = newNode;
        }

        return root;
            
    }
}