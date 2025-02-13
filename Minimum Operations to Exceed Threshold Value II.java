class Solution {
    public int minOperations(int[] nums, int k) {
        int numLength = nums.length;
        int steps = 0;
        Queue<Long> pQueue = new PriorityQueue<>();
        for (int i = 0; i < numLength; i++) {
            pQueue.add((long) nums[i]);
        }
        long firstValue = pQueue.remove();
        long secondValue;
        while (firstValue < k) {
            secondValue = pQueue.remove();
            long temp = (firstValue * 2) + secondValue;
            pQueue.add(temp);
            steps++;
            firstValue = pQueue.remove();
        }
        return steps;
    }
}