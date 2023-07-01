class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int sum = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            
            if (flowerbed[i] == 0) {
                
                if ((i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                    flowerbed[i] = 1;
                    sum++;
                }
            }
        }

        return sum >= n;
    }
}