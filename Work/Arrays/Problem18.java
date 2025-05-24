
public class p18 {
    public static void main(String[] args) {
             int arr[]={2,5,6,8,11};
            
        int target = 8;
        int result[] = new int[2];
        int i=0;
        int j=arr.length-1;
         
        while (i<j) {
            int sum =arr[i]+arr[j];
            if(sum==target){
                result[0]= arr[i];
                result[1]=arr[j];
                break;
                
            }
            else if (sum>target) {
                j--;
            }
            else{
                i++;
            }
             
        }

        for (int j2 = 0; j2 < result.length; j2++) {
            System.out.println(result[j2]);
        }
       
    }
}
