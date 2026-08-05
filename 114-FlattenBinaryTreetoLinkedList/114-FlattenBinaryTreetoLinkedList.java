// Last updated: 8/5/2026, 7:53:44 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public void flatten(TreeNode root) {
18        flattenTree(root);
19    }
20
21    private TreeNode flattenTree(TreeNode root) {
22        if (root == null)
23            return null;
24
25        TreeNode leftTail = flattenTree(root.left);
26        TreeNode rightTail = flattenTree(root.right);
27
28        if (leftTail != null) {
29            leftTail.right = root.right;
30            root.right = root.left;
31            root.left = null;
32        }
33
34        if (rightTail != null)
35            return rightTail;
36
37        if (leftTail != null)
38            return leftTail;
39
40        return root;
41    }
42}