// 3. Matrix Diagonal Sum
 class Solution {
    static int sumOfDiagonals(int[][] mat){
        int sum = 0;
        for(int i = 0; i < mat.length; i++){
            if(i != (mat.length-1-i)){
                sum += mat[i][i];
                sum += mat[i][mat.length-1-i];
            }else{
                sum += mat[i][i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        // int[][] mat = {{1,2,3},
        //                {4,5,6},
        //                {7,8,9}};
        int[][] mat = {{1,1,1,1},
                       {1,1,1,1},
                       {1,1,1,1},
                       {1,1,1,1}};
        System.out.println(sumOfDiagonals(mat));
    }
 }