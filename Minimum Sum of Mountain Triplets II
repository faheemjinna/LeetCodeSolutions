//2909. Minimum Sum of Mountain Triplets II
class Solution {
    public int minimumSum(int[] nums) 
    {
        int len = nums.length;
        int[] leftMinVal = new int[len];
        int[] rightMinVal = new int[len];
        int temp, min = Integer.MAX_VALUE;

        leftMinVal[0] = nums[0];
        for(int i=1;i<len;i++)
        {
            leftMinVal[i] = Math.min(leftMinVal[i-1],nums[i]);
        }

        rightMinVal[len-1] = nums[len-1];
        for(int j=len-2;j>=0;j--)
        {
            rightMinVal[j] = Math.min(rightMinVal[j+1],nums[j]);
        }

        int n, minVal1,minVal2;
        for(int i=1;i<len-1;i++)
        {
            n = nums[i]; 
            minVal1 = leftMinVal[i-1];
            minVal2 = rightMinVal[i+1];
            if(minVal1 < n && minVal2 < n)
            {
                temp = n + minVal1 + minVal2;
                if(min>temp)
                {
                    min = temp;
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
