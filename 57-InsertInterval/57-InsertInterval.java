// Last updated: 7/17/2026, 3:09:12 PM
1class Solution {
2    public int[][] insert(int[][] intervals, int[] newInterval) {
3        List<int[]> res = new ArrayList<>();
4        int i = 0, n = intervals.length;
5
6        // Add intervals before newInterval
7        while (i < n && intervals[i][1] < newInterval[0]) {
8            res.add(intervals[i++]);
9        }
10
11        // Merge overlapping intervals
12        while (i < n && intervals[i][0] <= newInterval[1]) {
13            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
14            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
15            i++;
16        }
17        res.add(newInterval);
18
19        // Add remaining intervals
20        while (i < n) {
21            res.add(intervals[i++]);
22        }
23
24        return res.toArray(new int[res.size()][]);
25    }
26}