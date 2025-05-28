//Generate Subsequence
// import java.util.ArrayList;

// class Solution{
//     static void generateSubsequence(int[] arr,int ind,ArrayList<Integer> al){
//         if(ind == arr.length){
//             System.out.println(al);
//             return;
//         }
//         al.add(arr[ind]);                               // Pick
//         generateSubsequence(arr,ind+1,al);              // Pick
//         al.remove(al.size()-1);                         // Not Pick
//         generateSubsequence(arr,ind+1,al);              // Not Pick
//     }
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4};
//         ArrayList<Integer> al = new ArrayList<>();
//         generateSubsequence(arr,0,al);
//     }
// }

//Time Complexity:O(n^2/2 + n/2) or O(n^2)
//Space Complexity:O(n)

import java.util.ArrayList;

class Solution{
    static void generateSubsequence(int[] arr,int ind,ArrayList<Integer> al){
        if(ind == arr.length){
            System.out.println(al);
            return;
        }
        generateSubsequence(arr,ind+1,al); 
        al.add(arr[ind]);                
        generateSubsequence(arr,ind+1,al);            
        al.remove(al.size()-1);           
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        ArrayList<Integer> al = new ArrayList<>();
        generateSubsequence(arr,0,al);
    }
}