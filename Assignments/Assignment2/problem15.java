class Solution{
    static int power(int num1,int num2){
        if(num2 <= 0 ){
            return 1;
        }
        return num1*power(num1, num2-1);
    }
    public static void main(String[] args) {
       System.out.println(power(2,6));
    }
}