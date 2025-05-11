//By Array
import java.util.HashSet;
import java.util.Arrays;

class Solution{
    static void majorityElements(int[] arr){
        Arrays.sort(arr);
        HashSet<Integer> al = new HashSet<>();
        int count = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] == arr[i-1]){
                count++;
            }else{
                count = 1;
            }

            if(count > arr.length/3){
                al.add(arr[i]);
            }
        }
        System.out.println(al);
    }

    public static void main(String[] args) {
        int[] arr = {11,33,33,11,33,11};
        majorityElements(arr);
    }
}

// Time Complexity: O(n)
// Space Complexity: O(3Elements)