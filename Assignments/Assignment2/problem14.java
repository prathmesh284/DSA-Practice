class Solution{
    static void divisibleByThree(int num,int index){
        if(3*index > num ){
            return;
        }
        System.out.println(3*index);
        divisibleByThree(num, index+1);
    }
    public static void main(String[] args) {
       divisibleByThree(100,1);
    }
}