// Link: https://leetcode.com/problems/plus-one/description/

class Solution {
    public int[] plusOne(int[] digits) {
        int count9 = 0;
        for(int i = 0; i < digits.length; i++) {
            if(digits[i] == 9) {
                count9++;
            }
        }
        
        if(count9 == digits.length) {
            int[] res = new int[digits.length+1];
            res[0] = 1;
            for(int j = 1; j < digits.length+1; j++) {
                res[j] = 0;
            }
            return res;
        } else {
            boolean isChanged = false;
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] != 9) {
                    digits[i] += 1;
                    return digits;
                } else if (digits[i] == 9 && !isChanged) {
                    digits[i] = 0;
                    isChanged = true;
                } else if (digits[i] == 9 && isChanged) {
                    digits[i] = 0;
                } else if (digits[i] != 9 && isChanged) {
                    digits[i] += 1;
                    return digits;
                }
            }
        }

        return digits;
    }
}