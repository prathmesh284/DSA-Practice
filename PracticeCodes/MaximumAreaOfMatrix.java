// Maximum Area of Histogram

import java.util.Stack;
class Solution {
    static int[] nearestSmallerLeft(int[] heights){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[heights.length];
        for (int i = 0; i < heights.length ; i++) {
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    static int[] nearestSmallerRight(int[] heights){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[heights.length];
        for (int i = heights.length-1; i>= 0; i--){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = heights.length;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    static int[] width(int[] nsl, int[] nsr){
        int[] width = new int[nsl.length];
        for(int i = 0; i < nsl.length; i++){
            width[i] = nsr[i] - nsl[i] -1;
        }
        return width;
    }
    static int histogram(int[][] mat){

        int[] heights = new int[mat[0].length];
        int max = 0;
        for (int[] mat1 : mat) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat1[j] == 1) {
                    heights[j]++;
                } else {
                    heights[j] = 0;
                }
            }
            int[] nsl = nearestSmallerLeft(heights);
            int[] nsr = nearestSmallerRight(heights);
            int[] widths = width(nsl,nsr);
            for(int i= 0; i < heights.length; i++){
                max = Math.max(max, heights[i]*widths[i]);
            }
        }
        return  max;
    }
    public static void main(String[] args){
        int[][] mat = {{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,0}};
        System.out.println(histogram(mat));
    }
}