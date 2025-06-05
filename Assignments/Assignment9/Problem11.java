// Generate N balanced Paranthesis

import java.util.ArrayList;
class Solution{
    static void generateParanthesis(String str,int n,int open,int close,ArrayList<String> al){
        if(str.length() == 2*n){
            al.add(str);
            return;
        }
        if(open < n){
            generateParanthesis(str+"(",n,open+1,close,al);
        }
        if(close < open){
            generateParanthesis(str+")",n,open,close+1,al);
        }
    }
    public static void main(String[] args){
        int n = 3;
        ArrayList<String> al = new ArrayList<>();
        generateParanthesis("",n,0,0,al);
        System.out.println(al);
    }
}