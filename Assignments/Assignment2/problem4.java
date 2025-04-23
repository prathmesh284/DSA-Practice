class Solution{
    static int countNum(int num){
        if(num <= 0) return 0;
        return 1 + countNum(num/10);
    }
    public static void main(String[] args) {
        System.out.println(countNum(98765));
    }
}