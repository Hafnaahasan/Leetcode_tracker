// Last updated: 7/14/2026, 2:14:45 PM
class Solution {
    public char findTheDifference(String s, String t) {
        char c = 0;
        for(char cs : s.toCharArray()) c^=cs;
        for(char ct : t.toCharArray()) c^=ct;
        return c;
    }
}