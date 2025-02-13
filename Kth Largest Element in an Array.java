class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> pQueue = new PriorityQueue(Collections.reverseOrder());
        int res =0;
        for (int i = 0; i < nums.length; i++) {
            pQueue.add(nums[i]);
        }
        for (int i = 0; i < k; i++) {
            res = pQueue.remove();
        }
        return res;
    }
}