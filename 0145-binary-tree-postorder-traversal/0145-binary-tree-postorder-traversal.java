import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>(); // Initialize the list to store the result
        postOrder(root, result); // Call the helper function
        return result;
    }

    private void postOrder(TreeNode root, List<Integer> result) {
        if (root == null) { // Base case: if the root is null, return
            return;
        }
        postOrder(root.left, result);  // Recur on the left subtree
        postOrder(root.right, result); // Recur on the right subtree
        result.add(root.val); // Add the current node's value to the list
    }
}
