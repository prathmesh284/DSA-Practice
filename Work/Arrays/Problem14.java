import java. util.*;
public class p14 {
    public static void main(String[] args) {
        int arr[]={1,1,0,3,4,3,4,1};
        Arrays.sort(arr);
        int max= arr[arr.length-1];
      int temp[] = new int[max];
      for (int i = 0; i < temp.length; i++) {
            temp[arr[i]]++;
      }
      for (int i = 0; i < temp.length; i++) {
            if (temp[i]!= 2 && temp[i]!=0) {
                System.out.println(i);
            }
      }

    }
}
