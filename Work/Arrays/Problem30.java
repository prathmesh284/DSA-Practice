
public class p30 {
    public static void main(String[] args) {
        int arr[] ={3,1,2,4};
        int k= 6;
        int i=0;
        int j = i;
       
        int count =0;

        while (i<arr.length) {
           int sum=0;
            while (j<arr.length) {
                    
                   sum+=arr[j];
            if(sum==k){
               count++;
                       
            }
            j++;
            }
            
            i++;
            j=i;
        }
        System.out.println(count);


        
    }
}
