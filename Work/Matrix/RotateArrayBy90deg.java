//Rotate Matrix By 90 degree

//By using temporary array.

// class Solution{
//     public static void main(String[] args) {
//         int[][] arr = {{1,2,3},
//                        {4,5,6},
//                        {7,8,9}};
//         int[][] temp = new int[arr.length][arr[0].length];        
//         for(int i = 0 ; i < arr.length ; i++){
//             for(int j = 0; j < arr[0].length; j++) {
//                 temp[j][arr.length-1-i] = arr[i][j];                         //By using temporary array.
//             }
//         }
//         for(int i = 0 ; i < temp.length ; i++){
//             for(int j = 0; j < temp[0].length; j++) {
//                 System.out.print(temp[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

//Time Complexity:O(n^2)
//Space Complexity:O(n*m)




//Without using temporary array.

class Solution{
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};

        //Transpose of Matrix
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //Arranging all rows in Reverse order.                                  //Without using temporary array.
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0; j < arr[0].length/2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr[0].length-1-j];
                arr[i][arr[0].length-1-j] = temp;
            }
        }

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

//Time Complexity:O(n^2)
//Space Complexity:O(1)
