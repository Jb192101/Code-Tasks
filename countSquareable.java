/*
Some numbers can be expressed as a difference of two squares, for example, 20 = 6^2-4^2 and 21 = 5^2-2^2.
Many numbers can be written this way, but not all.

Your Task
Complete the function that takes a positive integer n and returns the amount of numbers between 1 and n (inclusive)
that can be represented as the difference of two perfect squares.

Note: Your code should be able to handle n values up to 45000
 */

public class countSquareable {
    public static int countSquareable(int n){
        int count = 0;

        for(int k = 1; k <= n; k++) {
            if((k % 2) == 1 || k % 4 == 0) {
                count++;
            }
        }

        return count;
    }
}
