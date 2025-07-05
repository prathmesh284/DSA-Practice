// 3. Determine if Two Strings Are Close

class Solution{
    static void isCloseStrings(String word1,String word2,int ind, String ans,boolean[] visited){
        for(int i = 0 ; i < word1.length() ; i++){
            if(ans.length() == word2.length()){
                if(ans.equals(word2)){
                    System.out.println(true);
                    System.out.println(ans);
                    return;
                }
            }
            if(visited[i]){
                continue;
            }
            visited[i] = true;
            isCloseStrings(word1,word2,ind+1,ans+word1.charAt(i),visited);
            visited[i] = false;
        }
    }
    public static void main(String[] args) {
        String word1 = "abc", word2 = "bca";
        isCloseStrings(word1,word2,0,"",new boolean[word1.length()]);   
    }
}