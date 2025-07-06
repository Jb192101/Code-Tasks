// Link: https://leetcode.com/problems/max-points-on-a-line/description/

class Solution {
    public int maxPoints(int[][] points) {
        if(points.length == 1 || points.length == 2) {
            return points.length;
        }

        float k;
        float b;
        int count;
        Set<Integer> results = new HashSet<>();
        for(int i = 0; i < points.length; i++) {
            for(int j = i+1; j < points.length; j++) {
                count = 2;
                if (i == j) {
                    continue;
                }
                for (int g = j + 1; g < points.length; g++) {
                    int x = (points[j][1] - points[i][1]) * (points[g][0] - points[i][0]);
                    int y = (points[g][1] - points[i][1]) * (points[j][0] - points[i][0]);
                    if (x == y) {
                        count++;
                    }
                }

                results.add(count);
            }
        }

        int mx = 2;

        for(int i : results) {
            if(i > mx) {
                mx = i;
            }
        }

        return mx;
    }
}