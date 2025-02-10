class Solution {
    public int removeDuplicates(int[] nums) {
        int n=0;
        int len =nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<len;i++){
            if(map.get(nums[i])==null){
                map.put(nums[i],1);
                nums[n] = nums[i];
                n++;
            }
            else{
                continue;
            }
        }
        return n;
    }
}