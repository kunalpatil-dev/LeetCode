class Solution {
    public int largestPerimeter(int[] nums) {
        int n = nums.length;
        int perimeter = 0;
        int maxPer =0;
        Arrays.sort(nums);
        
         for(int i=0; i<n; i++){
            for(int j=i+1; j<n-1; j++){
                int k = j+1;
                
                if((nums[i]+nums[j])>nums[k]){
                    perimeter = nums[i]+nums[j]+nums[k];
                    
                    maxPer = Math.max(perimeter, maxPer);
                }
             
            }
         }
        
        return maxPer;
        
    }
}