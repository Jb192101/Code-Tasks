// Link: https://leetcode.com/problems/palindrome-number/description/

class Solution {
    public boolean isPalindrome(int x) {
        if(x == 0) {
            return true;
        }
        
        if(x < 0) {
            return false;
        }

        if(x % 10 == 0) {
            return false;
        }

        int y = x;
        List<Integer> list = new ArrayList<>();
        while(y != 0) {
            list.add(y % 10);
            y /= 10;
        }

        int ind1 = 0, ind2 = list.size()-1;
        while(ind2 > ind1) {
            if(!Objects.equals(list.get(ind1), list.get(ind2))) {
                return false;
            } else {
                ind2--;
                ind1++;
            }
        }

        return true;
    }
}