class Solution{
    static int gcd(int num1,int num2){
        if(num1 == 0 || num2 == 0){
            return Math.max(num1,num2);
        }
        return gcd(Math.max(num1,num2) % Math.min(num1,num2),Math.min(num1,num2));
    }
    public static void main(String[] args) {
        System.out.println(gcd(9,12));
    }
}