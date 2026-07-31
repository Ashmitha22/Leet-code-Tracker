// Last updated: 7/31/2026, 9:04:30 AM
1class Solution {
2    private Map<String, Boolean> memo = new HashMap<>();
3
4    public boolean isScramble(String s1, String s2) {
5        if (s1.equals(s2))
6            return true;
7
8        String key = s1 + "#" + s2;
9        if (memo.containsKey(key))
10            return memo.get(key);
11
12        int[] count = new int[26];
13        for (int i = 0; i < s1.length(); i++) {
14            count[s1.charAt(i) - 'a']++;
15            count[s2.charAt(i) - 'a']--;
16        }
17
18        for (int c : count) {
19            if (c != 0) {
20                memo.put(key, false);
21                return false;
22            }
23        }
24
25        int n = s1.length();
26
27        for (int i = 1; i < n; i++) {
28            if ((isScramble(s1.substring(0, i), s2.substring(0, i)) &&
29                 isScramble(s1.substring(i), s2.substring(i))) ||
30                (isScramble(s1.substring(0, i), s2.substring(n - i)) &&
31                 isScramble(s1.substring(i), s2.substring(0, n - i)))) {
32
33                memo.put(key, true);
34                return true;
35            }
36        }
37
38        memo.put(key, false);
39        return false;
40    }
41}