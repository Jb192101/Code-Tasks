/*
Given a triangle of consecutive odd numbers:

             1
          3     5
       7     9    11
   13    15    17    19
21    23    25    27    29
...
find the triangle's row knowing its index (the rows are 1-indexed), e.g.:

odd_row(1)  ==  [1]
odd_row(2)  ==  [3, 5]
odd_row(3)  ==  [7, 9, 11]
Note: your code should be optimized to handle big inputs.
 */

public class UserSolution {
    public static long[] oddRow(int n) {
        long[] seq = new long[n];

        seq[0] = 1;
        for (int j = 0; j < n; j++) {
            seq[0] += 2*j;
        }

        if (n == 1) {
            return seq;
        }

        for (int i = 1; i < n; i++) {
            seq[i] = seq[i-1] + 2;
        }
        return seq;
    }
}