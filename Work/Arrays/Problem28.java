import java.util.*;
public class p28 {
    public static void main(String[] args) {
        int arr[]={10,22,12,3,0,6};
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
                     boolean   temp = true;
            for (int j =i+1; j < arr.length; j++) {
             
                    if (arr[i]<arr[j]) {
                        temp = false;
                        break;
                    }
            }
            if (temp) {
                    result.add(arr[i]);
                
            }
            
        }
        for (int num : result) {
            System.out.println(num);
        }
    }
}
