package LeetCode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
public class BST {

    public TreeNode searchBST(TreeNode root, int val) {

        if(root.left.val<val){
            root = root.left;
        }
        return root.left;
    }
}
