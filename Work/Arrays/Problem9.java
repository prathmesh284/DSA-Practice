public class p9 {
    
    public static void main(String[] args) {
        int element[]={1,2,3,5};
        int requored[] ={1,2,3,4,5};
        int total =0;
        int arrays =0;
      for (int i = 0; i < requored.length-1; i++) {
            total = total^i;
            arrays =  arrays^element[i];
      }
      System.out.println(total- arrays);

    }
}
