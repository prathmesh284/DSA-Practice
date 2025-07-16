// Search in matrix

class Solution {
    static String searchInMatrix(int[][] mat, int target){
        int colLow = 0,colHigh = mat.length;
        int colMid = 0;
        while(colLow<=colHigh){
            colMid = colLow+(colHigh-colLow)/2;
            if(mat[colMid][0] == target){
                return "("+0+","+colMid+")" ;
            }else if(mat[colMid][0] >  target){
                colHigh = colMid-1;
            }else{
                colLow = colMid+1;
            }
        }
        
        int rowLow = colMid, rowHigh = mat[0].length;
        while(rowLow<=rowHigh){
            int rowMid = rowLow+(rowHigh-rowLow)/2;
            if(mat[colMid][rowMid] == target){
                return "("+colMid+","+rowMid+")" ;
            }else if(mat[colMid][rowMid] >  target){
                rowHigh = rowMid-1;
            }else{
                rowLow = rowMid+1;
            }
        }
        return "("+ -1 +","+ -1 +")" ; 
    }
    public static void main(String[] args){
        int[][] mat = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
        int target = 8;
        System.out.print(searchInMatrix(mat,target));
    }
}

//aayu_x_02