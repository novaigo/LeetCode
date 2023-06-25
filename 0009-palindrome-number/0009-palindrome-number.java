class Solution {
    public boolean isPalindrome(int x) {
        
        String stringOfX = String.valueOf(x);

       int i = 0;
       int j = stringOfX.length() - 1;

        while (i <= j) {
        
                if (stringOfX.charAt(i) != stringOfX.charAt(j)) {
                    return false;
                }
                    i++;
                    j--;
                }

       return true;
    }
}