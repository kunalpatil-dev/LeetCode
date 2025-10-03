class Solution {
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void sortColors(int[] nums) {
        int n = nums.length;
        for(int i = 0;i<n;i++){
            for(int j=0; j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    swap(nums, j, j+1);
                }
            }
        }
    }
}