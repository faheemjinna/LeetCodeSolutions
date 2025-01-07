class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int shift, current;
        int len = s.length();
        int arr[] = new int[len];
        for (int i = 0; i < shifts.length; i++) {
            if (shifts[i][2] == 1) {
                arr[shifts[i][0]]++;
                if(shifts[i][1]+1<len){
                    arr[shifts[i][1]+1]--;
                }
            } else {
                arr[shifts[i][0]]--;
                if(shifts[i][1]+1<len){
                    arr[shifts[i][1]+1]++;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            if(i>0){
                arr[i] += arr[i-1];
            }
            shift = arr[i] % 26;
            current = (int) s.charAt(i) - 97;
            current = ((current + shift) % 26 + 26) % 26;
            current += 97;
            s = s.substring(0, i) + (char) current + s.substring(i + 1, len);
        }
        return s;
    }
}