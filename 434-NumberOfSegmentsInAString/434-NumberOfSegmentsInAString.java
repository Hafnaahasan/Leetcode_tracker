// Last updated: 7/14/2026, 2:14:41 PM
class Solution {
    public int countSegments(String s) {
        String[] st= s.split(" ");
        int count = 0;

        for(String word:st){
            if(!word.isEmpty()){
                count++;
            }
        }
        return count;
    }
}