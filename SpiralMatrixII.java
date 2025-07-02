// Link: https://leetcode.com/problems/spiral-matrix-ii/description/

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result= new int[n][n];
        int minc=0,minr=0,maxc=n-1,maxr=n-1;
        int c=0;
        while(c<n*n){
            for(int i=minc;i<=maxc;i++){
                c++;
                result[minr][i]=c;
            }
            minr++;
            for(int i=minr;i<=maxr;i++){
                c++;
                result[i][maxc]=c;
            }
            maxc--;
            for(int i=maxc;i>=minc;i--){
                c++;
                result[maxr][i]=c;
            }
            maxr--;
            for(int i=maxr;i>=minr;i--){
                c++;
                result[i][minc]=c;
            }
            minc++;
        }
        return result;
    }
}