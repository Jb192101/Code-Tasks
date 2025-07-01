// Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            if (map.containsKey(currentChar)) {
                left = Math.max(left, map.get(currentChar) + 1);
            }
            map.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
