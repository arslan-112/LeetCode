class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length == 1){
            if(flowerbed[0] == 0 && n!=0)
            n--;  
        }
        else{
        for(int i=0;i<flowerbed.length && n>0; i++){
            if(i != 0 && i != flowerbed.length-1){
                if(flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
                    flowerbed[i] = 1; 
                    n--;
                }
            }else if(i ==0 && flowerbed[i] == 0 && flowerbed[i+1] == 0){
                flowerbed[i] = 1;
                n--;
            }else if(i == flowerbed.length- 1 && flowerbed[i] == 0 && flowerbed[i-1] ==0)
                n--;
            
            }
        }
        return (n==0);
        }
    }
