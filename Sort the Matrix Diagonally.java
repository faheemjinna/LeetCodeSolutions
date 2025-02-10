class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int x = mat.length;
        int y = mat[0].length;
        int[][] res = new int[x][y];
        // PriorityQueue<Integer> sortedQueue = new PriorityQueue<Integer>();
        HashMap<Integer, Queue<Integer>> differenceMap = new HashMap<>();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                differenceMap.putIfAbsent(i - j, new PriorityQueue<Integer>());
                differenceMap.get(i - j).add(mat[i][j]);
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                int diff = i - j;
                res[i][j] = differenceMap.get(diff).remove();
            }
        }
        return res;
    }
}