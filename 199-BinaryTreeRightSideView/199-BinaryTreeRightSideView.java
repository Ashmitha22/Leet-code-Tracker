// Last updated: 9/28/2026, 9:52:07 AM
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
17    public List<Integer> rightSideView(TreeNode root) {
18
19        List<Integer> result = new ArrayList<>();
20
21        if (root == null) {
22            return result;
23        }
24
25        Queue<TreeNode> queue = new LinkedList<>();
26        queue.offer(root);
27
28        while (!queue.isEmpty()) {
29
30            int size = queue.size();
31
32            for (int i = 0; i < size; i++) {
33
34                TreeNode node = queue.poll();
35
36                // Last node of this level
37                if (i == size - 1) {
38                    result.add(node.val);
39                }
40
41                if (node.left != null) {
42                    queue.offer(node.left);
43                }
44
45                if (node.right != null) {
46                    queue.offer(node.right);
47                }
48            }
49        }
50
51        return result;
52    }
53}