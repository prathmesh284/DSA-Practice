// Unique Paths in Grid with Obstacles

import java.util.ArrayList;
class Solution{
    static void uniquePaths(int[][] grid, int count, int ind, ArrayList<String> al){
        if(ind == grid[0].length){
            // if(al.size()){
            //     System.out.println(al);
            // }
            return;
        }
        // al.add();          
        uniquePaths(grid,count,ind+1,al);    
        al.remove(al.size()-1);  
        uniquePaths(grid,count,ind+1,al);
    }
    public static void main(String[] args){
        int[][] grid = {{0,0,0},{0,1,0},{0,0,0}};
        uniquePaths(grid, 0, 0, new ArrayList<>());
    }
}