// Split the Array

import java.util.HashSet;
class Solution {

    static boolean splitArray(int[] arr) {
        HashSet<Integer> hs1= new HashSet<>();
        HashSet<Integer> hs2= new HashSet<>();
        int[] num1 = new int[arr.length / 2];
        int[] num2 = new int[arr.length / 2];
        int i = 0, j = 0;
        for (int k=0;k<arr.length;k++){
            if(!hs1.contains(arr[k]) && i < num1.length){
                hs1.add(arr[k]);
                num1[i] = arr[k];
                i++;
            }else if(!hs2.contains(arr[k]) && j< num2.length){
                hs2.add(arr[k]);
                num2[j] = arr[k];
                j++;    
            }else{
                return false;
            }
        }
        System.out.println(hs1);
        System.out.println(hs2);
        return true;
    }
    

    public static void main(String[] args) {
    int[] arr = {1, 1, 1, 1};
        System.out.println(splitArray(arr));
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)
