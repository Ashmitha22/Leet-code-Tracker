// Last updated: 7/17/2026, 3:04:49 PM
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
4
5        List<int[]> result = new ArrayList<>();
6
7        for (int[] interval : intervals) {
8            if (result.isEmpty() || result.get(result.size() - 1)[1] < interval[0]) {
9                result.add(interval);
10            } else {
11                result.get(result.size() - 1)[1] =
12                    Math.max(result.get(result.size() - 1)[1], interval[1]);
13            }
14        }
15
16        return result.toArray(new int[result.size()][]);
17    }
18}