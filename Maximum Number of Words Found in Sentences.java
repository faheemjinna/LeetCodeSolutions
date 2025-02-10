class Solution {
    public int mostWordsFound(String[] sentences) {
        int len = sentences.length;
        int max = Integer.MIN_VALUE;
        int count = 1;
        for(int i=0;i<len;i++){
            for(int j=0;j<sentences[i].length();j++){
                if(sentences[i].charAt(j) == ' '){
                    count++;
                }
            }
            max = Integer.max(count, max);
            count = 1;
        }
        return max;
    }
}