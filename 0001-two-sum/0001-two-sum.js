/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
const twoSum = function(nums, target) {
    if (nums.length === 2) return [0,1];
    let arr = [];
    for (let i = 0; i < nums.length; i++) {
        let pair = target - nums[i];
        if (arr[pair] !== undefined) return [arr[pair], i];
        else arr[nums[i]] = i;
    }
}