// Last updated: 9/26/2026, 11:54:58 AM
1class Solution {
2    public int maximumGap(int[] nums) {
3
4        if (nums.length < 2) {
5            return 0;
6        }
7
8        int min = nums[0];
9        int max = nums[0];
10
11        
12        for (int num : nums) {
13            min = Math.min(min, num);
14            max = Math.max(max, num);
15        }
16
17        if (min == max) {
18            return 0;
19        }
20
21        int n = nums.length;
22
23        
24        int gap = (max - min + n - 2) / (n - 1);
25
26        int[] bucketMin = new int[n];
27        int[] bucketMax = new int[n];
28        boolean[] used = new boolean[n];
29
30        
31        for (int num : nums) {
32
33            int index = (num - min) / gap;
34
35            bucketMin[index] = used[index]
36                    ? Math.min(bucketMin[index], num)
37                    : num;
38
39            bucketMax[index] = used[index]
40                    ? Math.max(bucketMax[index], num)
41                    : num;
42
43            used[index] = true;
44        }
45
46        
47        int answer = 0;
48        int previousMax = min;
49
50        for (int i = 0; i < n; i++) {
51
52            if (!used[i]) {
53                continue;
54            }
55
56            answer = Math.max(answer, bucketMin[i] - previousMax);
57
58            previousMax = bucketMax[i];
59        }
60
61        return answer;
62    }
63}