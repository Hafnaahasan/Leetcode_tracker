// Last updated: 7/14/2026, 2:15:17 PM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] is = new int[200];
        int[] it = new int[200];
        int len = s.length();
        if(len != t.length()){
            return false;
        }
        for(int i=0;i<len;i++){
            if(is[s.charAt(i)] != it[t.charAt(i)]){
                return false;
            }
            is[s.charAt(i)] = i+1;
            it[t.charAt(i)] = i+1;
        }
        return true;
    }
}
