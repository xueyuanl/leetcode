package com.emc.mystic.manager.operation.core.factory.leet.dfs;

public class NumberofIslands {


    public int numIslands(char[][] grid) {

        int row = grid.length;

        if (row == 0) return 0;

        int cloumn = grid[0].length;



        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cloumn; j++) {

                if (grid[i][j] == '1') {

                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }


    private void dfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i, j + 1);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i - 1, j);

    }
}