// 6. Lucky Numbers in a Matrix

class Solution {
    static int luckyNum(int[][] mat){
        int[] col = new int[mat[0].length];
        for(int i = 0; i < mat[0].length; i++){
            int max = 0;
            for(int j = 0; j < mat.length; j++){
                max = Math.max(max,mat[j][i]);
            }
            col[i] = max;
        }
        int min = Integer.MAX_VALUE;
        for(int i:col){
            min = Math.min(min,i);
        }
        return min;
    }
    public static void main(String[] args){
        int[][] mat = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNum(mat));
    }
}