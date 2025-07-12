// Link: https://leetcode.com/problems/balanced-binary-tree/description/

class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null)  return true;

		if (maxDepth(root) == -1)  return false;
		return true;
    }

    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int lMax = maxDepth(root.left);
        int rMax = maxDepth(root.right);

        if (lMax == -1 || rMax == -1)  return -1;

        if (Math.abs(lMax - rMax) > 1)  return -1;

		return Math.max(lMax, rMax) + 1;
    }
}