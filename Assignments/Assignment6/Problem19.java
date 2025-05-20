//Correction needed

// Corporate Flight Bookings

import java.util.ArrayList;
import java.util.HashMap;
class Solution {
    static ArrayList<Integer> flightBooking(int[][] matrix, int n){
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        int i = matrix[0][0];
        while(i <= matrix[matrix.length-2][matrix.length-2]){
            for(i=0;i<matrix.length;i++){
                int index = matrix[i][0];
                while(index <= matrix[i][matrix.length-2]){
                    hm.put(index,hm.getOrDefault(index,0)+matrix[i][matrix.length - 1]);
                    index++;
                }
            }
        }
        for(Integer key: hm.keySet()){
            al.add(hm.get(key));
        }
        return al;
    }
    public static void main(String[] args) {
        int[][] bookings = {{1,2,10},{2,3,20},{2,5,25}};int n = 5;
        System.out.println(flightBooking(bookings,n));
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)
