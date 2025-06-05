// Binary Strings Without Consecutive 1s

class Solution {
    static void binaryStrings(int n,int ind,String str){
        if(n == ind){
            if(str.length() == n){
                System.out.println(str);
            }
            return;
        }
        if(str.length() != 0 && (str.charAt(str.length()-1) == '1')){
            binaryStrings(n,ind+1,str+"0");
        }
        else{
            binaryStrings(n,ind+1,str+"0");
            binaryStrings(n,ind+1,str+"1");
        }
    }
    public static void main(String[] args){
        int n = 3;
        binaryStrings( n, 0, "");
    }
}