// Link: https://leetcode.com/problems/longest-palindromic-substring/description/

class Solution {
    private int lo, maxLen;
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2)
            return s;
        
        for (int i = 0; i < len-1; i++) {
            extendPalind(s, i, i);
            extendPalind(s, i, i+1);
        }
        return s.substring(lo, lo + maxLen);
    }

    private void extendPalind(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            lo = j + 1;
            maxLen = k - j - 1;
        }
    }
}