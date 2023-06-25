class Solution {
    public boolean isPalindrome(int x) {

        // reversed x will be used for comparison
        int reversedX = 0;
        // adding tempX since we will be making changes
        int tempX = x;
        boolean isPalindrome = true;
        
        while (tempX != 0) {
            
            // getting the last digit from a number
            //  1. 121 % 10 = 1
            //  2. 12 % 10 = 2
            //  3. 1 % 10 = 1
            
            int number = tempX % 10;
            
            // forming reversedNumber for a comparison
            //  1. 0 * 10 + 1 = 1
            //  2. 1 * 10 + 2 = 12
            //  3. 12 * 10 + 1 = 121
        
            reversedX = reversedX * 10 + number;
            
            // removing the last digit from x, before the next loop
            
            tempX /= 10;
        }

        if (x < 0) {
            isPalindrome = false;
        
        } else if (x != reversedX) {
            isPalindrome = false;
        }
        return isPalindrome;
    }
}