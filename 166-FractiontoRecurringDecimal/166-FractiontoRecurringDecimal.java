// Last updated: 9/27/2026, 3:43:32 PM
1class Solution {
2    public String fractionToDecimal(int numerator, int denominator) {
3        if (numerator == 0) {
4            return "0";
5        }
6        StringBuilder result = new StringBuilder();
7        if ((numerator < 0) ^ (denominator < 0)) {
8            result.append("-");
9        }
10
11        long num = Math.abs((long) numerator);
12        long den = Math.abs((long) denominator);
13
14        result.append(num / den);
15
16        long remainder = num % den;
17
18        
19        if (remainder == 0) {
20            return result.toString();
21        }
22
23        result.append(".");
24
25        
26        HashMap<Long, Integer> map = new HashMap<>();
27
28        while (remainder != 0) {
29
30            
31            if (map.containsKey(remainder)) {
32                int position = map.get(remainder);
33                result.insert(position, "(");
34                result.append(")");
35                break;
36            }
37
38            map.put(remainder, result.length());
39
40            remainder *= 10;
41
42            result.append(remainder / den);
43
44            remainder %= den;
45        }
46
47        return result.toString();
48    }
49}