//Next Permutation (Recursive)

class Solution {
    static String permutation(String str,int ind,int count,String ans,boolean[] visited,String res){
        for(int i = 0; i < str.length(); i++){
            if(ans.length() == str.length()){
                if(ans.equals(str) || count < 2) count++; 
                if(count == 2){
                    res = ans;
                    System.out.println(res);
                    break;
                }
                return res;
            } 
            if(visited[i]){
                continue;
            }
            visited[i] = true;
            permutation(str,ind+1,count,ans+str.charAt(i),visited,res);
            visited[i] = false;
        }
        return res;
    }
    public static void main(String[] args){
        String str = "123";
        System.out.println(permutation(str,0,0,"",new boolean[str.length()],""));
    }
}