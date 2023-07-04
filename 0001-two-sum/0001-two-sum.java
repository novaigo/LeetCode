class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map <Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int counter = target - nums[i];

            if (numsMap.containsKey(counter)){
                return new int[] {i, numsMap.get(counter)};
            }
            numsMap.put(nums[i], i);
        }
        return new int[]{};
    }
}