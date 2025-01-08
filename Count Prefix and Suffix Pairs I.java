class Solution {
    public boolean isPrefixAndSuffix(String a, String b) {
        return b.startsWith(a) && b.endsWith(a);
    }

    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (i == j) {
                    continue;
                }
                if (isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }
        return count;
    }
}