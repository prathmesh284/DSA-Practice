class Solution{
    static void fun(int[] arr,int index){
        if(index >= arr.length){
            return;
        }
        System.out.print(arr[index]+" ");
        fun(arr,index+1);
        System.out.print(arr[index]+" ");
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        fun(arr,0);
    }
}