/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    
    for(let i=0;i<nums.length;i++){
       val=fn(init,nums[i]);
        init=val;
    }
    return init;
};