import java.util.ArrayList;

public class p29 {
    public static void main(String[] args) {
        int arr[]={10,22,12,3,0,6};
        int i=0;
        int j = arr.length-1;
          ArrayList<Integer> result = new ArrayList<>();
        while (i<arr.length && j>=0) {
            if (arr[i]>=arr[j]) {
                j--;
                if(j==i){
                    result.add(arr[i]);
                    
                }
                
            }
            i++;
        }
        for (int num : result) {
            System.out.println(num);
        }
    }
}
