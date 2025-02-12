class Solution {
    public int getSumOfDigit(int n) {
        int res = 0;
        while (n != 0) {
            res += n % 10;
            n /= 10;
        }
        return res;
    }

    public int maximumSum(int[] nums) {
        HashMap<Integer, Queue<Integer>> sumOfDigitMap = new HashMap<>();
        int lengthOfNumbers = nums.length;
        int sumOfDigit = 0;
        int max = -1;
        for (int i = 0; i < lengthOfNumbers; i++) {
            sumOfDigit = getSumOfDigit(nums[i]);
            sumOfDigitMap.putIfAbsent(sumOfDigit, new PriorityQueue<>(Collections.reverseOrder()));
            sumOfDigitMap.get(sumOfDigit).add(nums[i]);
        }
        for (Queue<Integer> queue : sumOfDigitMap.values()) {
            if (queue.isEmpty()) {
                continue;
            }
            Integer biggestNo = queue.remove();
            if (queue.isEmpty()) {
                continue;
            }
            Integer secondBiggestNo = queue.remove();
            if (biggestNo != null || secondBiggestNo != null) {
                max = Math.max(max, biggestNo + secondBiggestNo);
            }
        }
        return max;
    }
}