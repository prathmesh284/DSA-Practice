//Matrix Diagonal Sum
//By Brute Force
// class Solution {
//     static int matrixDiagonal(int[][] arr){
//         int sum=0;
//         for(int i = 0;i < arr.length;i++){
//             for(int j = 0;j < arr.length;j++){
//                 if(i == j || i == arr.length-1-j && j == arr.length-1-i){
//                     sum += arr[i][j];
//                 }
//             }
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//         System.out.println(matrixDiagonal(arr));
//     }
// }

//Optimal Solution
class Solution {
    static int matrixDiagonal(int[][] arr){
        int sum=0;
        for(int i = 0;i < arr.length;i++){
            sum += arr[i][i];
            if(i != arr.length-1-i){
                sum += arr[i][arr.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(matrixDiagonal(arr));
    }
}
//Time Complexity: O(n)
//Space Complexity: O(1)
