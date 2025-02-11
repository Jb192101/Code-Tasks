/*
Create a function which checks if a given number n can be written as the sum of two cubes in two different ways:

n = a^3 + b^3 = c^3 + d^3

All the numbers a, b, c and d should be different and greater than 0.

Example
1729 --> true
// 1729 = 9³ + 10³ = 1³ + 12³

42   --> false
// cannot be expressed as the sum of two cubes in 2 different ways
 */

public class hasTwoCubeSums {
    public static boolean hasTwoCubeSums(int n) {
        int count = 0;
        for(int i = 1; i < Math.pow(n, 1.0/3.0); i++) {
            for(int j = i + 1; j < Math.pow(n, 1.0/3.0); j++) {
                if (i*i*i + j*j*j == n) {
                    count++;
                }
            }

        }

        if(count == 2) {
            return true;
        }

        return false;
    }
}
