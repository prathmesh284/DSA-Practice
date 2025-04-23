class Solution{
    static int reverseNum(int num,int sum){
        if(num <= 0){
            return sum;
        }
        sum = sum*10 + num%10;
        return reverseNum(num/10,sum);
    }
    public static void main(String[] args) {
        int num = 10010;
        int reverse = reverseNum(num,0);
        if(num == reverse){
            System.out.println(num+" is Palindrome");   
        } 
        else {
            System.out.println(num+" is Not Palindrome");
        }
    }
}