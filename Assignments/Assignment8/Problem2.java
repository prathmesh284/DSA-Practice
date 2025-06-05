// Count Number of Distinct Integers After Reverse Operations

import java.util.ArrayList;
import java.util.Collections;
class Solution {

    static ArrayList<Integer> countNumberOfDistinctIntegers(ArrayList<Integer> al){
        int limit = al.size();
        for(int i = 0; i < limit ; i++){
            int reverseInt = reverseNum(al.get(i),0);
            al.add(reverseInt);
        }
        Collections.sort(al);
        for(int i = 0; i < al.size()-1; i++){
            if(al.get(i).equals( al.get(i+1))){
                al.remove(i);
                i--;
            }
        }
        return al;
    }

    static int reverseNum(int num,int sum){
        if(num <= 0){
            return sum;
        }
        sum = sum*10 + num%10;
        return reverseNum(num/10,sum);
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(13);
        al.add(10);
        al.add(12);
        al.add(31);
        System.out.println(countNumberOfDistinctIntegers(al));
    }
}