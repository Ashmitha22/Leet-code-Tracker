// Last updated: 9/27/2026, 3:45:01 PM
1class Solution {
2    public String convertToTitle(int columnNumber) {
3        StringBuilder result = new StringBuilder();
4
5        while (columnNumber > 0) {
6            columnNumber--;   // adjust because Excel is 1-based
7            int rem = columnNumber % 26;
8            
9            result.append((char)(rem + 'A'));
10            
11            columnNumber = columnNumber / 26;
12        }
13
14        return result.reverse().toString();
15    }
16}