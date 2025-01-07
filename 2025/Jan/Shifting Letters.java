class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int shift,current;
        char ch;
        String res="";
        int len = shifts.length;
        for(int i=len-2;i>=0;i--){
            shifts[i] += shifts[i+1]%26;
        }
        for(int i=0;i<s.length();i++){
            shift = shifts[i]%26;
            ch = s.charAt(i);
            current = (int)ch - 97;
            current +=shift;
            current = current % 26;
            current +=97;
            res += (char)current;
        }
        return res;
    }
}