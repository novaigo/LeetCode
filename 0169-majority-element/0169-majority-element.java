class Solution {
    public int majorityElement(int[] nums) {

        //Boyer-Moore Voting Algorithm
        //If the count is 0, assign the current element as the new candidate.
        //If the current element is the same as the candidate, increment the count.
        //If the current element is different from the candidate, decrement the count.

        int count = 0;
        int candidate = 0;
        
        for (int i = 0; i < nums.length; i++) {

            if (count == 0) {
                candidate = nums[i];
            }

            if (nums[i] == candidate) {
                count ++;
            } else {
                count --;
            }
        }
        return candidate;
    }
}