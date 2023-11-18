/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    if (nums.length === 2) return [0,1];
    let map = {};
    for (let i = 0; i < nums.length; i++) {
        let pair = target - nums[i];
        let f = map[pair];
        if (f !== undefined) return [f, i];
        else map[nums[i]] = i;
    }
}