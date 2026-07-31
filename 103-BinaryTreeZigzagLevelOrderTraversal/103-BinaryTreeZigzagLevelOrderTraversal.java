// Last updated: 7/31/2026, 9:43:09 AM
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
17    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
18        List<List<Integer>> result = new ArrayList<>();
19
20        if (root == null)
21            return result;
22
23        Queue<TreeNode> queue = new LinkedList<>();
24        queue.offer(root);
25        boolean leftToRight = true;
26
27        while (!queue.isEmpty()) {
28            int size = queue.size();
29            LinkedList<Integer> level = new LinkedList<>();
30
31            for (int i = 0; i < size; i++) {
32                TreeNode node = queue.poll();
33
34                if (leftToRight)
35                    level.addLast(node.val);
36                else
37                    level.addFirst(node.val);
38
39                if (node.left != null)
40                    queue.offer(node.left);
41
42                if (node.right != null)
43                    queue.offer(node.right);
44            }
45
46            result.add(level);
47            leftToRight = !leftToRight;
48        }
49
50        return result;
51    }
52}