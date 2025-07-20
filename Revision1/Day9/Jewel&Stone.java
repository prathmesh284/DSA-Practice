// 3. Jewels and Stones

class Solution {
    static int jewelsStones(String jewels,String stones){
        int count = 0;
        for(int i=0; i < stones.length(); i++){
            if(jewels.contains(""+stones.charAt(i))){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        System.out.println(jewelsStones(jewels,stones));
    }
}