// Matrix Block Sum


import java.util.ArrayList;
class Solution {
    static ArrayList<ArrayList<Integer>> matrixBlockSum(int[][] mat,int K) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        int m = mat.length, n = mat[0].length;

        for (int i = 0; i < m; i++) {
            ArrayList<Integer> al2 = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int r = Math.max(0, i - K); r <= Math.min(m - 1, i + K); r++) {
                    for (int c = Math.max(0, j - K); c <= Math.min(n - 1, j + K); c++) {
                        sum += mat[r][c];
                    }
                }
                al2.add(sum);
            }
            al.add(al2);
        }
        return al;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int k = 1;
        System.out.println(matrixBlockSum(mat,k));
    }
}
// Time Complexity: O(2n+m)
// Space Complexity: O(26)
