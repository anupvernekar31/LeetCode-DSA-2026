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
    void findPath(TreeNode node, ArrayList<String> ans, String temp) {
        temp += String.valueOf(node.val);  // Add the current node value to the path
        if (node.left != null) {
            findPath(node.left, ans, temp + "->");  // Traverse left
        }
        if (node.right != null) {
            findPath(node.right, ans, temp + "->"); // Traverse right
        }
        if (node.left == null && node.right == null) {
            ans.add(temp);  // Add path if leaf node
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> ans = new ArrayList<>();
        if (root != null) findPath(root, ans, "");  // Start traversal from the root
        return ans;
    }

    // static void collectPaths(Node node, ArrayList<Integer> path,
    //                          ArrayList<ArrayList<Integer>> paths) {
    //     if (node == null)
    //         return;

    //     // Append this node to the path
    //     path.add(node.data);

    //     // If it's a leaf node, store the path
    //     if (node.left == null && node.right == null) {
    //         paths.add(new ArrayList<>(path));
    //     }
    //     else {
    //         // Otherwise, try both subtrees
    //         collectPaths(node.left, path, paths);
    //         collectPaths(node.right, path, paths);
    //     }

    //     // Backtrack: remove the last element
    //     // from the path
    //     path.remove(path.size() - 1);
    // }

    // // Function to get all paths from root to leaf
    // static ArrayList<ArrayList<Integer>> Paths(Node root) {
    //     ArrayList<ArrayList<Integer>> paths = new ArrayList<>();
    //     ArrayList<Integer> path = new ArrayList<>();
    //     collectPaths(root, path, paths);
    //     return paths;
    // }
}