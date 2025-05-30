import java.util.ArrayList;

class Solution{
    static int countSubsequence(int[] arr,int ind,ArrayList<Integer> al,int k,int sum){
        if(ind == arr.length){
            if(sum == k){
                return 1;
            }
            return 0;
        }
        al.add(arr[ind]);                
        int counter = countSubsequence(arr,ind+1,al,k,sum+arr[ind]); 
        al.remove(al.size()-1);
        int nextCounter = countSubsequence(arr,ind+1,al,k,sum);            
        return counter+nextCounter;         
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,1};int k = 2;
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println(countSubsequence(arr,0,al,k,0));
    }
}