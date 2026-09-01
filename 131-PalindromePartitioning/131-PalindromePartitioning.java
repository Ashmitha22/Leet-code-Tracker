// Last updated: 9/1/2026, 10:27:45 PM
1class Solution {
2    public List<List<String>> partition(String s) {
3
4        List<List<String>> ans = new ArrayList<>();
5        backtrack(s, 0, new ArrayList<>(), ans);
6        return ans;
7    }
8
9    void backtrack(String s, int start, List<String> path,
10                   List<List<String>> ans) {
11
12        if (start == s.length()) {
13            ans.add(new ArrayList<>(path));
14            return;
15        }
16
17        for (int i = start; i < s.length(); i++) {
18
19            if (isPalindrome(s, start, i)) {
20
21                path.add(s.substring(start, i + 1));
22
23                backtrack(s, i + 1, path, ans);
24
25                path.remove(path.size() - 1);
26            }
27        }
28    }
29
30    boolean isPalindrome(String s, int left, int right) {
31
32        while (left < right) {
33            if (s.charAt(left) != s.charAt(right))
34                return false;
35
36            left++;
37            right--;
38        }
39
40        return true;
41    }
42}