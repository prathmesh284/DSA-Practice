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
    public static void main(String[] args){
        int[] heights ={6,2,5,4,5,1,6 };
        int[] nsl = nearestSmallerLeft(heights);
        int[] nsr = nearestSmallerRight(heights);
        int[] widths = width(nsl,nsr);
        int max = 0;
        // System.out.println("Areas:");
        for(int i= 0; i < heights.length; i++){
            max = Math.max(max, heights[i]*widths[i]);
            // System.out.print(heights[i]*widths[i]);
        }
        System.out.println(max);
    }
}