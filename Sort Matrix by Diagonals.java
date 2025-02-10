class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int x = grid.length;
        int y = grid[0].length;
        int[][] res = new int[x][y];
        // PriorityQueue<Integer> sortedQueue = new PriorityQueue<Integer>();
        HashMap<Integer, Queue<Integer>> differenceMap = new HashMap<>();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                int diff = i - j;
                differenceMap.putIfAbsent(diff, diff>=0?new PriorityQueue<Integer>(Collections.reverseOrder()):new PriorityQueue<Integer>());
                differenceMap.get(i - j).add(grid[i][j]);
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