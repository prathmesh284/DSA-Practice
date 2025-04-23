class Solution{
    static int countNum(int num){
        int count = 0;
        while(num > 0){
            num = num / 10;
            count++;
        }
        return count;
    }

    static boolean isArmStrong(int num,int count){
        double sum = 0, org = num;
        while(num > 0){
            sum = sum + Math.pow(num%10 , count);
            num = num / 10;
        }
        if(org == sum) return true;
        else return false;
    }
    public static void main(String[] args) {
        int num = 153;
        int count = countNum(num);
        System.out.println(isArmStrong(num, count));   
    }
}