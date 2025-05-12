class Solution{
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        for(int i = arr.length-1; i>=0 ; i--) {
            for(int j = arr[0].length-1; j>=0; j--) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}