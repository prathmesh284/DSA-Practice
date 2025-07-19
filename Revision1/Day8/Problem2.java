// 15. Corporate Flight Bookings

class Solution {
    static int[] flightBook(int[][] bookings,int n){
        int[] ans = new int[n];

        for(int i = 0; i < ans.length; i++){
            for (int[] booking : bookings) {
                if (i+1 >= booking[0] && i+1 <= booking[1]) {
                    ans[i] += booking[2];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] bookings = {{1,2,10},{2,3,20},{2,5,25}};
        int n = 5;
        int[] ans = flightBook(bookings,n);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}