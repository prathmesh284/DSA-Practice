// Shortest Distance to Target String in a Circular Array

class Solution {
    static int shortestDistance(String[] words,String target,int startIndex){
        int min = Integer.MAX_VALUE;
        int index = 0;
        while(index <= startIndex){
            if(startIndex < words.length/2 && words[index].equals(target)){
                min = Math.min(min,startIndex-index);              
            }else if(startIndex > words.length/2 && words[index].equals(target)){
                min = Math.min(min,(words.length - startIndex)+index);
            }
            index++;
            // System.out.println("1");
        }
        while(index < words.length){
            if(startIndex < words.length/2 && words[index].equals(target)){
                min = Math.min(min,(words.length - index)+startIndex);
            }else if(startIndex > words.length/2 && words[index].equals(target)){
                min = Math.min(min,index - startIndex);
            }
            index++;
            // System.out.println("2");
        }
        if(min != Integer.MAX_VALUE) return min;
        else return -1;
    }
    public static void main(String[] args){
        String[] words = {"i","eat","leetcode"};
        String target = "ate";
        int startIndex = 0;
        System.out.println(shortestDistance(words,target,startIndex));
    }
}