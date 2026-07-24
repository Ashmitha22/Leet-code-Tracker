// Last updated: 7/24/2026, 2:03:13 PM
1class Solution {
2    public int strStr(String haystack, String needle) {
3        if(needle.isEmpty()) return 0;
4        if(!haystack.contains(needle)) return -1;
5        return haystack.indexOf(needle);
6        
7    }
8}