// Greatest Common Divisor of Strings

class Solution{
    static String greatestCommonDivisor(String str1,String str2){
        int min = Math.min(str1.length(),str2.length());
        for(int i = 0; i < min ; i++){
            int ind = min;
            while(ind >= i){
                if(str1.contains(str2.substring(i, ind))) return str2.substring(i, ind);
                ind--;
            }
        }
        return "";
    }
    public static void main(String[] args){
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(greatestCommonDivisor(str1,str2));
    }
}

//Changes required,not passing all testcase.