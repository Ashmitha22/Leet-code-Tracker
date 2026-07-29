// Last updated: 7/29/2026, 9:04:01 PM
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
17    public List<TreeNode> generateTrees(int n) {
18        if (n == 0)
19            return new ArrayList<>();
20
21        return build(1, n);
22    }
23
24    private List<TreeNode> build(int start, int end) {
25        List<TreeNode> result = new ArrayList<>();
26
27        if (start > end) {
28            result.add(null);
29            return result;
30        }
31
32        for (int i = start; i <= end; i++) {
33            List<TreeNode> leftTrees = build(start, i - 1);
34            List<TreeNode> rightTrees = build(i + 1, end);
35
36            for (TreeNode left : leftTrees) {
37                for (TreeNode right : rightTrees) {
38                    TreeNode root = new TreeNode(i);
39                    root.left = left;
40                    root.right = right;
41                    result.add(root);
42                }
43            }
44        }
45
46        return result;
47    }
48}