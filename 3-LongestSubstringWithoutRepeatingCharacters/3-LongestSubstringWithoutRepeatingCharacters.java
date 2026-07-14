// Last updated: 7/14/2026, 2:16:07 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxl=0;
        Set<Character> sc = new HashSet<>();
        int start = 0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            while(sc.contains(c)){
                sc.remove(s.charAt(start));
                start++;
            }
            sc.add(c);
            maxl=Math.max(maxl,i-start+1);
        }
        return maxl;
    }
}