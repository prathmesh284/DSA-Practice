class p1{
    public static void main(String[] args) {
        int arr[]={1,0,2,3,0,4,0,1};
        int temp[] = new int[arr.length];
        int index =0;
        for (int i = 0; i < temp.length; i++) {
            if(arr[i]!=0){
                temp[index]= arr[i];
                index++;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]+" ");
        }
    }
}