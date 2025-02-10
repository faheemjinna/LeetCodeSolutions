class Solution {
    public int minPosition(int[] nums){
        int n=0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(min>nums[i])
            {
                min = Math.min(min, nums[i]);
                n = i;
            }
        }
        return n;
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<k;i++)
        {
            nums[minPosition(nums)] *= multiplier; 
        }
        return nums;
    }
}