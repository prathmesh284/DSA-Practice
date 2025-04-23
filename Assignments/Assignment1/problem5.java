class Solution{
    static void divisor(int num, int index){
        int org = num;
        if(index > Math.sqrt(num)){
            return;
        }
        if(num % index == 0){
            System.out.println(index);
        }
        divisor(num,index+1);
        if(num % (num / index) == 0  && (num /index) != Math.sqrt(org)){
            System.out.println(num/index);
        }
    }
    public static void main(String[] args) {
        int num = 36;  
        divisor(num,1);
    }
}