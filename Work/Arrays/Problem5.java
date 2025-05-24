import java.util.ArrayList;

public class p5 {
    static ArrayList<Integer> findunion(int arr1[], int arr2[]){
        ArrayList<Integer> result = new ArrayList<>();
        int i=0;
        int j=0;
        while (i<arr1.length&&j<arr2.length) {
           if(arr1[i]<=arr2[j]){
             if(result.size()==0|| result.get(result.size()-1)!=arr1[i]){
                result.add(arr1[i]);
                
            }
            i++;
           }
            else{
                 if(result.size()==0||result.get(result.size()-1)!= arr2[j]){
                result.add(arr2[j]);
              
            }
              j++;
            }
           
            while ( i<arr1.length) {
                result.add(arr1[i]);
                i++;
            }
            
            
            while ( j<arr2.length) {
                result.add(arr2[j]);
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
 int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
        ArrayList<Integer> temp = new ArrayList<>();
        temp = findunion(arr1, arr2);
        System.out.println(temp);
    }
}
