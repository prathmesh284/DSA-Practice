class Solution{
    public static void main(String[] args) {
        int reverseNum = 0;
        int num = 12321;
        int org = num;
        while(num > 0){
            reverseNum = reverseNum*10 + num%10;
            num = num / 10;
            
        }
        if(org == reverseNum){
            System.out.println(org+" is Palindrome");
        }else{
            System.out.println(org+" is Not Palindrome");
        }
    }
}