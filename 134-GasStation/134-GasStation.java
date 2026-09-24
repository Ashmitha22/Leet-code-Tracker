// Last updated: 9/24/2026, 9:39:22 PM
1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3
4        int totalGas = 0;
5        int totalCost = 0;
6
7        int currentGas = 0;
8        int start = 0;
9
10        for (int i = 0; i < gas.length; i++) {
11
12            totalGas += gas[i];
13            totalCost += cost[i];
14
15            currentGas += gas[i] - cost[i];
16
17            // Current starting point cannot work
18            if (currentGas < 0) {
19                start = i + 1;
20                currentGas = 0;
21            }
22        }
23
24        // No possible starting point
25        if (totalGas < totalCost) {
26            return -1;
27        }
28
29        return start;
30    }
31}