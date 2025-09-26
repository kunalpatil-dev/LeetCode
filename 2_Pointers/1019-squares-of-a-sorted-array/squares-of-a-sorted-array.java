class Solution {
    public int[] sortedSquares(int[] nums) {
        int n= nums.length;
        // for(int i=0; i<n; i++){
        //     nums[i]=nums[i]*nums[i];
        // }
        // Arrays.sort(nums);

        int i=0;
        int j=n-1;
        while(i<=j){
            if(i==j){
                nums[i]=nums[i]*nums[i];
                break;
            }
            nums[i]=nums[i]*nums[i];
            nums[j]=nums[j]*nums[j];
            i++;
            j--;
        }
        Arrays.sort(nums);

        return nums;
    }
}