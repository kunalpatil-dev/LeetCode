class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        int closestSum = 0;
        int minDiff = Integer.MAX_VALUE;
        int diff = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    diff = Math.abs(sum - target);
                    minDiff = Math.min(diff, minDiff);
                    if (diff <= minDiff) {
                        closestSum = sum;
                        System.out.println(closestSum);
                    }

                }

            }
        }

        return closestSum;
    }
}