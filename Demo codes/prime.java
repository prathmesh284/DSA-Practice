class Prime{

    static void primeNumber(int n){
        int counter = 0;
        for(int i=1 ; i<=Math.sqrt(n) ; i++){
            if(n%i == 0 && n%(n/i)==0){
                counter++;
            }
            if(counter > 1){
                break;
            }
        }
        if(counter == 1){
            System.out.println(n+" is Prime number");
        }else{
            System.out.println(n+" is Not Prime number");
        }
    }

    public static void main(String[] args){
        primeNumber(91);
    }
}