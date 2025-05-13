//Placing zero 

//By using brute froce approach
// class Solution{
//     static void makeRowMinusOne(int[][] arr,int i){
//         for(int j=0; j<arr[0].length; j++){
//             if(arr[i][j] != 0){
//                 arr[i][j] = -1;
//             }
//         }
//     }

//     static void makeColMinusOne(int[][] arr,int j){
//         for(int i=0; i<arr.length; i++){
//             if(arr[i][j] != 0){
//                 arr[i][j] = -1;
//             }
//         }
//     }

//     public static void main(String[] args) {                         //Brute force approach
//         int[][] arr = {{1,1,1},
//                       {1,0,1},
//                       {1,1,1}};
//         for(int i = 0;i < arr.length;i++){
//             for(int j = 0;j < arr[0].length;j++){
//                 if(arr[i][j] == 0){
//                     makeRowMinusOne(arr,i);
//                     makeColMinusOne(arr,j);
//                 }
//             }
//         }

//         for(int i = 0;i < arr.length;i++){
//             for(int j = 0;j < arr[0].length;j++){
//                 if(arr[i][j] == -1){
//                     arr[i][j] = 0;
//                 }
//             }
//         }

//         for(int i = 0;i < arr.length;i++){
//             for(int j = 0;j < arr[0].length;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

//Time Complexity: O(m*n(m+n)) + O(m*n)
//Space Complexity: O(m+n)




//By using 1D array
// class Solution{

//     public static void main(String[] args) {
//         int[][] arr = {{1,1,1},
//                       {1,0,1},
//                       {1,1,1}};

//         int[] rows = new int[arr.length];
//         int[] cols = new int[arr[0].length];
//         for(int i = 0;i < arr.length;i++){
//             for(int j = 0;j < arr[0].length;j++){
//                 if(arr[i][j] == 0){
//                     rows[i] = 1;
//                     cols[j] = 1;
//                 }
//             }
//         }

//         for(int i = 0;i < arr.length;i++){                               //By using 1D array
//             for(int j = 0;j < arr[0].length;j++){
//                 if(rows[i] == 1 || cols[j] == 1){
//                     arr[i][j] = 0;
//                 }
//             }
//         }

//         for(int i = 0;i < arr.length;i++){
//             for(int j = 0;j < arr[0].length;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

//Time Complexity: O(2*m*n)
//Space Compexity: O(m+n)





//By optimal approach, no extra array is used
class Solution{

    public static void main(String[] args) {
        int[][] arr = {{1,1,1},
                      {1,0,1},
                      {1,1,1}};
        int colsIndicator = 1;
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[0].length;j++){
                if(arr[i][j] == 0){
                    arr[i][0] = 0;
                    if(j != 0){
                        arr[0][j] = 0;
                    }else{
                        colsIndicator = 0;
                    }
                }
            }
        }

        for(int i = 0;i < arr.length;i++){                                  //By optimal approach, no extra array is used
            for(int j = 0;j < arr[0].length;j++){
                if(arr[i][0] == 0 || arr[0][j] == 0){
                    arr[i][j] = 0;
                }
            }
        }

        if(colsIndicator == 0){
            for(int i = 0;i < arr.length;i++){
                arr[i][0] = 0;
            }
        }

        if(arr[0][0] == 0){
            for(int j = 0;j < arr[0].length;j++){
                arr[0][j] = 0;
            }
        }

        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

//Time Complexity: O(2*m*n)
//Space Complexity: O(1)