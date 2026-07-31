// Last updated: 7/31/2026, 9:12:59 AM
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
17    public void recoverTree(TreeNode root) {
18        TreeNode[] nodes = new TreeNode[3]; // first, second, prev
19        inorder(root, nodes);
20
21        int temp = nodes[0].val;
22        nodes[0].val = nodes[1].val;
23        nodes[1].val = temp;
24    }
25
26    private void inorder(TreeNode root, TreeNode[] nodes) {
27        if (root == null)
28            return;
29
30        inorder(root.left, nodes);
31
32        if (nodes[2] != null && nodes[2].val > root.val) {
33            if (nodes[0] == null)
34                nodes[0] = nodes[2];
35            nodes[1] = root;
36        }
37
38        nodes[2] = root;
39
40        inorder(root.right, nodes);
41    }
42}