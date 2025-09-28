class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        int left = 0;//i
        int currLen =0;

        for (int right = 0; right < n; right++) {
            sum = sum + nums[right];

            while (sum >= target) {
                currLen = right-left+1;
                minLen = Math.min(minLen, currLen);
                sum = sum - nums[left];
                left++;
            }
        }

        return (minLen == Integer.MAX_VALUE) ?  0: minLen;
        
    }
}
