//Next Permutation (Recursive)

class Solution {
    static String permutation(String str,int ind,int count,String ans,boolean[] visited){
        for(int i = 0; i < str.length(); i++){
            if(ans.length() == str.length()){

                if(ans.equals(str)) {
                    count = 1; 
                }else if(count >= 1){
                    count++;
                }else{
                    count = 0;
                }
                StringBuilder res = new StringBuilder();
                if(count == 2){
                    res = res.append(ans);
                    System.out.println(res);
                    break;
                }
                return res.toString();
            } 
            if(visited[i]){
                continue;
            }
            visited[i] = true;
            permutation(str,ind+1,count,ans+str.charAt(i),visited);
            visited[i] = false;
        }
        return "";
    }
    public static void main(String[] args){
        String str = "123";
        permutation(str,0,0,"",new boolean[str.length()]);
    }
}