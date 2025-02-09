class Solution {
    public long countBadPairs(int[] nums) {
        int len = nums.length;
        long goodPairs = 0;
        long badPairs = (1L * len * (len - 1)) / 2;
        HashMap<Integer, Integer> goodMap = new HashMap<>();
        for (int i = 0; i < len; i++) {
            nums[i] = nums[i] - i;
            int temp = goodMap.getOrDefault(nums[i],0);
            goodPairs +=temp;
            goodMap.put(nums[i], temp+1);
        }

        return badPairs - goodPairs;
    }
}