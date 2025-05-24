public class p12 {
    
   public static void main(String[] args) {
     int arr[]={1,1,2,3,1,1,1,34,1};
    int max =0;
    int count =0;
    for (int i = 0; i < arr.length-1; i++) {
        if (arr[i]==1) {
            count++;
            max = Math.max(max, count);
        }else{
            count=0;
        }
        
    }
  System.out.println(max);
   }
    
}
