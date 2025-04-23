class Solution{
    static int sumNum(int num){
        if(num <= 0) return 0;
        return num%10 + sumNum(num/10);
    }
    public static void main(String[] args) {
        System.out.println(sumNum(12345));
    }
}