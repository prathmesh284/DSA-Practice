//Linear Search

class Solution {
    static int linearSearch(int[] num, int k){
        int flag = -1;
        for(int i = 0; i < num.length; i++){
            if(num[i] == k){
                flag = i;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        int k = 3;
        System.out.println(linearSearch(num,k));
    }
}