// Link: https://leetcode.com/problems/minimum-depth-of-binary-tree/description/

class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        if(root.left == null && root.right == null) {
            return 1;
        }

        int lMin = 0, rMin = 0;
        if(root.left != null) {
            lMin = minDepth(root.left);
        } else {
            lMin = Integer.MAX_VALUE;
        }
        if(root.right != null) {
            rMin = minDepth(root.right);
        } else {
            rMin = Integer.MAX_VALUE;
        }

        return Math.min(lMin, rMin) + 1;
    }
}