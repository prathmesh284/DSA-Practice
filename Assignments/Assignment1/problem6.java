class Solution{
    public static void main(String[] args) {
        int num = 97,counter = 0;  
        for(int i = 1; i <= Math.sqrt(num) ; i++){
            if(num % i == 0 && num % (num/i) == 0){
                counter++;
            }
            if(counter > 1){
                break;
            }
        }
        if(counter == 1) System.out.println(num+" is Prime");
        else System.out.println(num+" is Not Prime");
    }
}