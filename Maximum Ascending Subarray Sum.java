class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int temp = 0;
        int prev = 0;
        for (int i : nums) {
            int n = i;
            if (n > prev) {
                temp += n;
                prev = n;
            }
            else{
                max = Integer.max(temp, max);
                prev = n;
                temp = n;
            }

        }
        max = Integer.max(temp, max);
        return max;
    }
}