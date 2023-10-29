class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int max = 0;
        int count = 0;
        int occ [] = new int[rectangles.length]; 
        for(int i=0; i<rectangles.length;i++){
            if(rectangles[i][0] < rectangles[i][1]){
                occ[i] = rectangles[i][0];
                if(rectangles[i][0] > max){
                max = rectangles[i][0];
                }
            }else {
                occ[i] = rectangles[i][1];
                if(rectangles[i][1] > max)
                    max = rectangles[i][1];
                
            }
        }
        for(int i=0; i<occ.length;i++){
            if(occ[i] == max)
                count++;
        }
        return count;

    }
}