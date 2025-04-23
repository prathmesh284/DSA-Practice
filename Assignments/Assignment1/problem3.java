class Solution{
    public static void main(String[] args) {
        int num1 = 24,num2 = 36;
        int max = Math.max(num1,num2);
        int min = Math.min(num1,num2);
        while(max != 0 && min != 0){
            max = max%min;
            max = max + min;
            min = max - min;
            max = max - min;
        }
        System.out.println(max);
    }
}