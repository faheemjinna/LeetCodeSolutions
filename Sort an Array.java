class Solution {
    public int[] sortArray(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        for(int i=0;i<len;i++){
            pQueue.add(nums[i]);
        }
        for(int i=0;i<len;i++){
            res[i] = pQueue.remove();
        }
        return res;
    }
}