package com.emc.mystic.manager.operation.core.factory.leet;

public class Searcha2DMatrixII {


    public static void main(String[] args) {

        Searcha2DMatrixII s = new Searcha2DMatrixII();

        int[][] nums = {{1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};

        s.searchMatrix(nums, 5);

    }


    public boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length;
        int column;
        if (row != 0) {
            column = matrix[0].length;
        } else {
            column = 0;
        }


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
                if (matrix[i][j] > target) {
                    column = j;
                }

            }
        }

        return false;
    }

}