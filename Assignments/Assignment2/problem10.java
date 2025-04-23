class Solution{
    static int reverseNum(int num,int sum){
        if(num <= 0){
            return sum;
        }
        sum = sum*10 + num%10;
        return reverseNum(num/10,sum);
    }
    public static void main(String[] args) {
        int num = 12345;
        System.out.println(reverseNum(num,0));
    }
}