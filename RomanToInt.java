// Link: https://leetcode.com/problems/roman-to-integer/

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char c;
        int prev = -5;
        int sum = 0;
        for(int i = s.length()-1; i > -1; i--) {
            c = s.charAt(i);

            if(map.get(c) < prev) {
                sum -= map.get(c);
            } else {
                sum += map.get(c);
            }

            prev = map.get(c);
        }

        return sum;
    }
}