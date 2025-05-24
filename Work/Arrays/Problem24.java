//Moores voting algorith
public class p24 {
    public static void main(String[] args) {
        int candidate = 0;
        int vote =0;
        int arr[]={7,5,7,7,1,5,7};

        for (int i = 0; i < arr.length; i++) {
            
            for (int j = i+1; j < arr.length; j++) {
                if (vote==0) {
                    candidate=arr[i];
                }
                if(candidate ==arr[i]){
                    vote++;
                }
                else{
                    vote--;
                }
                
            }
        }
        System.out.println(candidate);
    }
}
