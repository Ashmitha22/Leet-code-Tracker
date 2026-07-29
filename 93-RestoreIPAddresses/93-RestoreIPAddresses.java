// Last updated: 7/29/2026, 7:24:28 PM
1class Solution {
2    public List<String> restoreIpAddresses(String s) {
3        List<String> result = new ArrayList<>();
4        backtrack(s, 0, 0, "", result);
5        return result;
6    }
7
8    private void backtrack(String s, int index, int parts, String current, List<String> result) {
9        if (parts == 4 && index == s.length()) {
10            result.add(current.substring(0, current.length() - 1));
11            return;
12        }
13
14        if (parts == 4 || index == s.length()) {
15            return;
16        }
17
18        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {
19            String segment = s.substring(index, index + len);
20
21            if ((segment.length() > 1 && segment.charAt(0) == '0') ||
22                Integer.parseInt(segment) > 255) {
23                continue;
24            }
25
26            backtrack(s, index + len, parts + 1,
27                    current + segment + ".", result);
28        }
29    }
30}