// Word Break with Permutations

class Solution {
    static void workBreakPermutation(String str, String[] wordDict, boolean[] visited, int ind, String current, String res){
        if (current.equals(str)) {
            System.out.println(res.trim());
            return;
        }
        if (current.length() > str.length() || !str.startsWith(current)) {
            return;
        }
        for(int i = 0; i < wordDict.length; i++){
            if(!visited[i]){
                visited[i] = true;
                workBreakPermutation(str,wordDict,visited,ind+1,current+""+wordDict[i],res+" "+wordDict[i]);
                visited[i] = false;
            }
        }
    }
    public static void main(String[] args){
        String str = "catsanddog";
        String[] wordDict = {"cat", "cats", "and", "sand", "dog"};
        workBreakPermutation(str, wordDict, new boolean[wordDict.length], 0, "", "");
    }
}