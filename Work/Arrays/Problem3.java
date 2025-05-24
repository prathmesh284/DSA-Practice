import java. util.ArrayList;
public class p3 {
    static ArrayList union(int arr1[], int arr2[]){
        ArrayList<Integer> temp = new ArrayList<>();
      
        for (int i = 0; i < arr1.length; i++) {
            temp.add(arr1[i]);

        }for (int i = 0; i < arr2.length; i++) {
            if(!temp.contains(arr2[i])){
                temp.add(arr2[i]);
            }
        }
        return temp;

    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7,8,9,10};
        int arr2[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        ArrayList<Integer>result = new ArrayList<>();
        result = union(arr1, arr2);
        System.out.println(result);

        
    }
}
