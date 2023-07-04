class Solution {
    public int mySqrt(int x) {
        
   long r = x; // initilaze r with with the input number
        while (r*r > x) { //sqr must be greater than root
            r = (r+x/r) /2; //babylonian method
        }
        return (int) r; //return integer
    }
}