class Solution {
    public int minOperations(int[] nums) {
        int prev = 1;
        int c=0;
        for (int n : nums) {
            if(n!=prev){
                c++;
                prev=n;
            }
        }
        return c;
    }
}