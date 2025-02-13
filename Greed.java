/*
Greed is a dice game played with five six-sided dice. Your mission, should you choose to accept it, is to score a throw according to these rules. You will always be given an array with five six-sided dice values.

 Three 1's => 1000 points
 Three 6's =>  600 points
 Three 5's =>  500 points
 Three 4's =>  400 points
 Three 3's =>  300 points
 Three 2's =>  200 points
 One   1   =>  100 points
 One   5   =>   50 point
A single die can only be counted once in each roll. For example, a given "5" can only count as part of a triplet (contributing to the 500 points) or as a single 50 points, but not both in the same roll.

Example scoring

 Throw       Score
 ---------   ------------------
 5 1 3 4 1   250:  50 (for the 5) + 2 * 100 (for the 1s)
 1 1 1 3 1   1100: 1000 (for three 1s) + 100 (for the other 1)
 2 4 4 5 4   450:  400 (for three 4s) + 50 (for the 5)
In some languages, it is possible to mutate the input to the function. This is something that you should never do. If you mutate the input, you will not be able to pass all the tests.
 */

public class Greed{
    public static int greedy(int[] dice){
        //code here
        int ones = 0;
        int twos = 0;
        int threes = 0;
        int fouthes = 0;
        int fifths= 0;
        int sex = 0;
        for (int c = 0; c < dice.length; c++) {
            if (dice[c] == 1) {
                ones++;
            } else if (dice[c] == 2) {
                twos++;
            } else if (dice[c] == 3) {
                threes++;
            } else if (dice[c] == 4) {
                fouthes++;
            } else if (dice[c] == 5) {
                fifths++;
            } else if (dice[c] == 6) {
                sex++;
            }
        }

        int result = 0;
        result = (ones/3)*1000 + (ones%3)*100 + (fifths%3)*50 + (sex/3)*600 + (fifths/3)*500 + (fouthes/3)*400 + (threes/3)*300 + (twos/3)*200;

        return result;
    }
}