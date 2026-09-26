// Last updated: 9/26/2026, 11:52:11 AM
1import java.util.Stack;
2
3class MinStack {
4
5    Stack<Integer> mainStack;
6    Stack<Integer> minStack;
7
8    public MinStack() {
9
10        mainStack = new Stack<>();
11        minStack = new Stack<>();
12
13    }
14
15    public void push(int value) {
16
17        mainStack.push(value);
18
19        if (minStack.isEmpty() || value <= minStack.peek()) {
20
21            minStack.push(value);
22
23        }
24
25    }
26
27    public void pop() {
28
29        if (mainStack.peek().equals(minStack.peek())) {
30
31            minStack.pop();
32
33        }
34
35        mainStack.pop();
36
37    }
38
39    public int top() {
40
41        return mainStack.peek();
42
43    }
44
45    public int getMin() {
46
47        return minStack.peek();
48
49    }
50}