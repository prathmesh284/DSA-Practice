class Solution{
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int totle = arr.length * arr[0].length;
        int sr = 0,sc = 0,er = arr.length-1,ec = arr[0].length-1;
        int dir = -1;
        while(totle != 0){
            dir = (dir+1)%4;
            if(dir == 0){
                for(int i = sc;i <= ec;i++){
                    System.out.print(arr[sr][i]+" ");
                    totle--;
                }
                sr++;
            }else if(dir == 1){
                for(int i = sr;i <= er;i++){
                    System.out.print(arr[i][ec]+" ");
                    totle--;
                }
                ec--;
            }else if(dir == 2){
                for(int i = ec;i >= sc;i--){
                    System.out.print(arr[er][i]+" ");
                    totle--;
                }
                er--;
            }else{
                for(int i = er;i >= sr;i--){
                    System.out.print(arr[i][sc]+" ");
                    totle--;
                }
                sc++;
            }
        }
    }
}