class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int maxLen = 0;
        for (int i = 1; i < n - 1; i++) {
            // check if arr[i] is a peak
            if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                int left = i - 1;
                int right = i + 1;

                // go left while strictly increasing
                while (left > 0 && arr[left] > arr[left - 1]) {
                    left--;
                }

                // go right while strictly decreasing
                while (right < n - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }

                int len = right - left + 1;
                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen;
    }
}
