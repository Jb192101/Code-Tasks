/*
Write a function that takes an array of numbers (integers for the tests) and a target number. It should find two different items in the array that, when added together, give the target value. The indices of these items should then be returned in a tuple / list (depending on your language) like so: (index1, index2).

For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.

The input will always be valid (numbers will be an array of length 2 or greater, and all of the items will be numbers; target will always be the sum of two different items from that array).

two_sum([1, 2, 3], 4) == {0, 2}
two_sum([3, 2, 4], 6) == {1, 2}
 */

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int ind1 = 0;
        int ind2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                }

                if (numbers[i] + numbers[j] == target) {
                    ind1 = i;
                    ind2 = j;
                    break;
                }
            }
        }
        int[] result = {ind1, ind2};
        return result;
    }
}