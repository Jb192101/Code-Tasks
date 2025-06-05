// URL : https://leetcode.com/problems/length-of-last-word/

class Solution {
    public int lengthOfLastWord(String s) {
        int l = s.length();

        char[] chars = s.toCharArray();

        int index = l - 1;
        if(chars[index] == ' ') {
            while (chars[index] == ' ') {
                index--;
            }
        }

        int size = 0;
        while(index >= 0 && chars[index] != ' ') {
            size++;
            index--;
        }

        return size;
    }
}