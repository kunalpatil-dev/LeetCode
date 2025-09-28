
class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        // taverse from largest to smallest
        for (int i = nums.length - 1; i >= 2; i--) {
            // check triangle inequality for the top 3
            if (nums[i - 2] + nums[i - 1] > nums[i]) {
                // valid triangle found
                return nums[i - 2] + nums[i - 1] + nums[i];
            }
        }

        return 0;
    }
}