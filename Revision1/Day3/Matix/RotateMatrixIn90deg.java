// Rotate Matrix in 90 degree

class Solution {
    static int[][] rotateMatrix(int[][] mat){
        for(int i = 0 ; i < mat.length/2 ; i++){
            for(int j = 0; j < mat[0].length ; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[mat.length-1][j];
                mat[mat.length-1][j] = temp;
            }
        }
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0; j < mat[0].length ; j++){
                if(i<=j){
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }else{
                    break;
                }
            }
        }
        // for(int i = 0 ; i < mat.length ; i++){
        //     for(int j = i+1; j < mat[0].length ; j++){
        //         int temp = mat[i][j];
        //         mat[i][j] = mat[j][i];
        //         mat[j][i] = temp;        
        //     }
        // }
        return mat;
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        int[][] ans = rotateMatrix(mat);
        for(int[] i:ans){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}