package LeetCode.T257;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        List<Integer> path = new ArrayList<>();
        traversal(root, path, res);
        return res;
    }

    public static void traversal(TreeNode node, List<Integer> path, List<String> res) {
        path.add(node.val);
        if (node.left == null && node.right == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < path.size() - 1; i++) {
                sb.append(path.get(i)).append("->");
            }
            sb.append(path.get(path.size() - 1));
            res.add(sb.toString());
            return;
        }
        if (node.left != null) {
            traversal(node.left, path, res);
            path.remove(path.size() - 1);
        }
        if (node.right != null) {
            traversal(node.right, path, res);
            path.remove(path.size() - 1);
        }
    }
}