// Rotate Matrix in 90 degree

class Solution {
    static void spiralRotation(int[][] mat){
        int totle = mat.length * mat[0].length;
        int sr = 0, er = mat[0].length -1;
        int sc = 0, ec = mat.length - 1;
        int dir = -1;

        while(totle != 0){
            dir = (dir+1)%4;
            switch (dir) {
                case 0 -> {
                    for(int j = sc; j <= ec; j++){
                        System.out.print(mat[sr][j]+" ");
                        totle--;
                    }   sr++;
                }
                case 1 -> {
                    for(int i = sr; i <= er; i++){
                        System.out.print(mat[i][ec]+" ");
                        totle--;
                    }   ec--;
                }
                case 2 -> {
                    for(int j = ec; j >= sc; j--){
                        System.out.print(mat[er][j]+" ");
                        totle--;
                    }   er--;
                }
                default -> {
                    for(int i = er; i >= sr; i--){
                        System.out.print(mat[i][sc]+" ");
                        totle--;
                    }   sc++;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        spiralRotation(mat);
    }
}