package gaopin.tulun;

import java.util.LinkedList;
import java.util.Queue;

public class OrangesRotting {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int len = grid.length;
        int col = grid[0].length;
        int freshCount = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    freshCount++;
                } else if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                }
            }
        }

        int[][] adds = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int result = 0;
        while (freshCount > 0 && !queue.isEmpty()) {
            result++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] pos = queue.poll();
                if (pos != null) {
                    for (int j = 0; j < 4; j++) {
                        int r = pos[0] + adds[j][0];
                        int c = pos[1] + adds[j][1];
                        if (r >= 0 && r < len && c >= 0 && c < col && grid[r][c] == 1) {
                            grid[r][c] = 2;
                            freshCount--;
                            queue.add(new int[]{r, c});
                        }
                    }
                }
            }
        }
        if (freshCount > 0) {
            return -1;
        }
        return result;
    }
}
