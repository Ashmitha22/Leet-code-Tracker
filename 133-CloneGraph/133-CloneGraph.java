// Last updated: 9/22/2026, 9:27:46 PM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> neighbors;
6    public Node() {
7        val = 0;
8        neighbors = new ArrayList<Node>();
9    }
10    public Node(int _val) {
11        val = _val;
12        neighbors = new ArrayList<Node>();
13    }
14    public Node(int _val, ArrayList<Node> _neighbors) {
15        val = _val;
16        neighbors = _neighbors;
17    }
18}
19*/
20
21class Solution {
22
23    HashMap<Node, Node> map = new HashMap<>();
24
25    public Node cloneGraph(Node node) {
26
27        if (node == null) {
28            return null;
29        }
30
31        // Already cloned
32        if (map.containsKey(node)) {
33            return map.get(node);
34        }
35
36        // Create clone
37        Node clone = new Node(node.val);
38
39        // Store original -> clone
40        map.put(node, clone);
41
42        // Clone all neighbors
43        for (Node neighbor : node.neighbors) {
44            clone.neighbors.add(cloneGraph(neighbor));
45        }
46
47        return clone;
48    }
49}