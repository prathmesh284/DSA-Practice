import java.util.*;
public class p23 {
    public static void main(String[] args) {
          int arr[]={2,2,1,1,1,2,2};
          int count =0;
          int num =arr[0];
          int max= 0;
          Arrays.sort(arr);
          for (int i = 1; i < arr.length; i++) {
            if (arr[i]==arr[i-1]) {
                count++;
            }else{
                count =1;
            }
         if(count>max){
                max = count;
                num = arr[i];
         }
          }
          System.out.println(num+":"+max);

        
    }
}
