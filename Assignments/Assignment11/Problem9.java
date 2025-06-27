// 9. Spiral Order Matrix with Obstacles
class Solution {
    static void spiralOrderMatrix(int[][] mat){
        int total = mat.length * mat[0].length;
        int sr = 0, sc = 0, er = mat.length-1, ec = mat[0].length-1;
        int dir = -1;
        while(total != 0){
            dir = (dir+1)%4;
            switch (dir) {
                case 0 -> {
                    for(int j = sc; j <= ec ; j++){
                        if(mat[sr][j] != -1){
                            System.out.print(mat[sr][j]);
                        }
                        total--;
                    }   sr++;
                }
                case 1 -> {
                    for(int i = sr; i <= er ; i++){
                        if(mat[i][ec] != -1){
                            System.out.print(mat[i][ec]);
                        }
                        total--;
                    }   ec--;
                }
                case 2 -> {
                    for(int j = ec; j >= sc ; j--){
                        if(mat[er][j] != -1){
                            System.out.print(mat[er][j]);
                        }
                        total--;
                    }   er--;
                }
                case 3 -> {
                    for(int i = er; i >= sr ; i--){
                        if(mat[i][sc] != -1){
                            System.out.print(mat[i][sc]);
                        }
                        total--;
                    }   sc++;
                }
                default -> {
                }
            }
        }
    }
    public static void main(String[] args){
        int[][] mat = {{1,2,3},{4,-1,6},{7,8,9}};
        spiralOrderMatrix(mat);
    }
}