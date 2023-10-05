class Solution {
    public int diagonalSum(int[][] mat) {
        int sum =0;
        for(int i=0;i<mat.length;i++){
            for(int j=0; j<mat[0].length;j++){
                if(i == j)
                    sum += mat[i][j];
                else if(j == mat[0].length-1-i && i!=j)
                    sum += mat[i][j];
            }
        }
        return sum;
    }
}