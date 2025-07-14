// Make all column and Row Zero if Zero found

class Solution{
    static int[][] zero(int[][] mat){
        int colsInd = 1;
        //make 1st row & column as refernce array
        for (int[] mat1 : mat) {
            for (int j = 0; j<mat[0].length; j++) {
                if (mat1[j] == 0) {
                    mat1[0] = 0;
                    if(j!=0){
                        mat[0][j] = 0;
                    }else{
                        colsInd = 0;
                    }
                }
            }
        }

        //set all value to 0 if as per refernce array
        for(int i = 1; i < mat.length; i++){
            for(int j = 1; j < mat[0].length; j++){
                if(mat[i][0] == 0 || mat[0][j] == 0){
                    mat[i][j] = 0;
                }
            }
        }
        for (int[] mat1 : mat) {
            if (colsInd == 0) {
                mat1[0] = 0;
            }
        }
        for(int j = 0 ; j < mat[0].length ; j++){
            if(mat[0][0] == 0){
                mat[0][j] = 0;
            }
        }
        return mat;
    }
    public static void main(String[] args) {
        int[][] mat = {{1,1,1},
                       {1,0,1},
                       {1,1,1}};
        int[][] ans = zero(mat);
        for(int[] i:ans){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}