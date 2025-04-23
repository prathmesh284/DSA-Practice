class Solution{
    static int productNum(int num){
        if(num <= 0) return 1;
        return num%10 * productNum(num/10);
    }
    public static void main(String[] args) {
        System.out.println(productNum(12345));
    }
}