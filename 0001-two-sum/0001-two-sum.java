class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map <Integer, Integer> numbersMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            numbersMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int j = target - nums[i];

            if (numbersMap.containsKey(j) && numbersMap.get(j) != i ) {
                return new int[]{i, numbersMap.get(j)}; 
        }
    }
    return new int[]{};
    }
}