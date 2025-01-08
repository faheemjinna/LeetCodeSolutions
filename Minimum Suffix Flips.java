class Solution {
    public int minFlips(String target) {
        int count = 0;
        char last = '0';
        for (char ch:target.toCharArray()) {
            if(ch!=last){
                count++;
                last = ch;
            }
        }
        return count;
    }
}