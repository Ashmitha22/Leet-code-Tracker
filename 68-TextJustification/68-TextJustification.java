// Last updated: 7/24/2026, 11:38:28 AM
1class Solution {
2    public List<String> fullJustify(String[] words, int maxWidth) {
3        List<String> ans = new ArrayList<>();
4        int i = 0;
5
6        while (i < words.length) {
7            int j = i, len = 0;
8
9            while (j < words.length &&
10                   len + words[j].length() + (j - i) <= maxWidth) {
11                len += words[j].length();
12                j++;
13            }
14
15            StringBuilder sb = new StringBuilder();
16            int gaps = j - i - 1;
17
18            if (j == words.length || gaps == 0) {
19                // Last line or single word
20                for (int k = i; k < j; k++) {
21                    sb.append(words[k]);
22                    if (k != j - 1)
23                        sb.append(" ");
24                }
25                while (sb.length() < maxWidth)
26                    sb.append(" ");
27            } else {
28                int totalSpaces = maxWidth - len;
29                int eachSpace = totalSpaces / gaps;
30                int extra = totalSpaces % gaps;
31
32                for (int k = i; k < j; k++) {
33                    sb.append(words[k]);
34                    if (k != j - 1) {
35                        for (int s = 0; s < eachSpace; s++)
36                            sb.append(" ");
37                        if (extra > 0) {
38                            sb.append(" ");
39                            extra--;
40                        }
41                    }
42                }
43            }
44
45            ans.add(sb.toString());
46            i = j;
47        }
48
49        return ans;
50    }
51}