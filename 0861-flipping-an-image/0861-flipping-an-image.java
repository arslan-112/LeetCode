class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i<image.length; i++){
            int j = 0;
            int k = image.length-1;
            int temp;
            while(j <= k){
                if(j != k){
                temp = image[i][j];
                image[i][j] = image[i][k];
                image[i][k] = temp;
                }
                if(image[i][j] == 0)
                    image[i][j] = 1;
                else 
                    image[i][j] = 0;
                if(j !=k){
                if(image[i][k] == 0)
                    image[i][k] = 1;
                else
                    image[i][k] = 0;
                }
                j++;
                k--;
            }
        
        }
        return image;
    }
}