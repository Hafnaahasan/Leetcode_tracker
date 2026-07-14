// Last updated: 7/14/2026, 2:15:44 PM
class Solution {
    public int lengthOfLastWord(String s) {
        int a=0;
        s=s.trim();
      for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i)!=' '){
            a++;
        }
        else{
            break;
        }
      }
      return a;
    }
}