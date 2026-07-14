// Last updated: 7/14/2026, 2:14:19 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int output=0;
        for(int i=0;i<n;i++){
            if(i==n-i-1)output +=mat[i][i];
            else output+=(mat[i][i]+mat[n-i-1][i]);
        }
        return output;
        
    }
}