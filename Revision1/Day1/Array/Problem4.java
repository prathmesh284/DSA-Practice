// Union of Two Sorted Array

import java.util.ArrayList;
class Solution {
    static ArrayList<Integer> unionArray(int[] num1,int[] num2){
        int m = num1.length, n = num2.length;
        ArrayList<Integer> al = new ArrayList<>();
        int i = 0, j = 0;
        while(i < m && j < n){
            if(num1[i] > num2[j]){
                if(al.isEmpty() || al.get(al.size()-1) != num2[j]){
                    al.add(num2[j]);    
                }
                j++;
            }else if(num1[i] < num2[j]){
                if(al.isEmpty() || al.get(al.size()-1) != num1[i]){
                    al.add(num1[i]);
                }
                i++;
            }else if(num1[i] == num2[j]){
                if(al.isEmpty() || al.get(al.size()-1) != num1[i]){
                    al.add(num1[i]);
                }
                i++;
                j++;
            }
        }
        return al;
    }
    public static void main(String[] args) {
        int[] num1 = {1,2,3,4,5}, num2 = {2,3,3,4,5};
        System.out.println(unionArray(num1,num2));
    }
}