class Solution {
    public boolean isvowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }
    public int vowelFlag(String word) {
        int temp = word.length();
        int left, right;
        left = 0;
        right = temp - 1;
        if(isvowel(word.charAt(left)) && isvowel(word.charAt(right))){
            return 1;
        }
        return 0;
    }

    public int[] vowelStrings(String[] words, int[][] queries) {
        int len = words.length;
        int left,right;
        int count = 0;
        int arr[] = new int[len];
        int res[] = new int[queries.length];
        for (int i = 0; i < len; i++) {
            arr[i] = vowelFlag(words[i]);
        }
        for(int i=0;i<queries.length;i++){
            left = queries[i][0];
            right = queries[i][1];
            for(int j=left;j<=right;j++){
                count += arr[j];
            }
            res[i] = count;
            count = 0;
        }
        return res;
    }
}