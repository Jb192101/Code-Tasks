/*
Longest Common Prefix
Solved
Easy
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string ""

Link: https://leetcode.com/problems/longest-common-prefix
*/

import java.util.ArrayList;
import java.util.List;

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        List<Character> list = new ArrayList<>();

        for(String s : strs) {
            for(char c : s.toCharArray()) {
                list.add(c);
            }
        }

        StringBuilder res = new StringBuilder();
        int i = 0;
        boolean t;
        for(char key : list) {
            t = containsChar(strs, key, i);
            if(containsChar(strs, key, i)) {
                res.append(key);
            } else {
                break;
            }
            i++;
        }

        return res.toString();
    }

    private boolean containsChar(String[] strs, char c, int n) {
        int count = 0;
        int q;
        for(String s : strs) {
            q = -1;
            for(char ch : s.toCharArray()) {
                q++;
                if(ch == c && n == q) {
                    count++;
                    break;
                }
            }
        }

        return count == strs.length;
    }
}