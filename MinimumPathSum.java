package com.datastrcutures.trees;


class MinimumPathSum {
    private static int getMin(int val1, int val2) {
        return val1<val2 ? val1 : val2;
    }
    private static int getMinimumSum(int[][] arr) {
//        for (int i = 0; i<arr.length; i++) {
//            for (int j = 0; j<arr[i].length; j++) {
//                if (i == 0 && j == 0) {
//                    continue;
//                } else if (i == 0) {
//                    arr[i][j] = arr[i][j] + arr[i][j - 1];
//                } else if (j == 0) {
//                    arr[i][j] = arr[i][j] + arr[i - 1][j];
//                } else {
//                    arr[i][j] = getMin(arr[i - 1][j] + arr[i][j], arr[i][j - 1] + arr[i][j]);
//                }
//            }
//        }
//        int r = arr.length - 1;
//        int c = arr[0].length - 1;
//       // System.out.println(arr[1].length);
//        return arr[r][c];
        int r = arr.length;
       int c = arr[0].length;
       for(int i=1;i<c;i++){
           arr[0][i]=arr[0][i-1]+arr[0][i];

       }
       for(int i=1;i<r;i++){
           arr[i][0]=arr[i-1][0]+arr[i][0];
       }
       for(int i=1;i<r;i++){
           for(int j=1;j<c;j++){
               arr[i][j]+=Math.min(arr[i-1][j],arr[i][j-1]);
           }
       }
       return arr[r-1][c-1];

    }
    public static void main(String[] args) {
        int[][] inputArray = {{1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}};
        System.out.println("Length of minimum path sum: " + getMinimumSum(inputArray));
    }
}
