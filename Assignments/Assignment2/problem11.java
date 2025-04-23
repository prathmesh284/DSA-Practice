class Solution{
    static int countNum(int num,int count,int key){
        if(num <= 0){
            return count;
        }
        if(num%10 == key) count++;
        return countNum(num/10,count,key);
    }
    public static void main(String[] args) {
        int count = 0,key = 3;
        System.out.println(countNum(122345,count,key));
    }
}