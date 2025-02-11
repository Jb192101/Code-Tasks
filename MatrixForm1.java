/*
Your task, is to create N×N multiplication table, of size provided in parameter.

For example, when given size is 3:

1 2 3
2 4 6
3 6 9
For the given example, the return value should be:

[[1,2,3],[2,4,6],[3,6,9]]

 */

public class MatrixForm1 {

    public static int [][] multiplicationTable(int n){
        int[][] matrix = new int[n][n];

        int start_num = 1;
        int offset = 1;

        for(int i = 0; i < n; i++) {
            matrix[i][0] = start_num;
            for(int j = 1; j < n; j++) {
                matrix[i][j] = matrix[i][j-1] + offset;
            }

            offset++;
            start_num++;
        }

        return matrix;
    }

}
