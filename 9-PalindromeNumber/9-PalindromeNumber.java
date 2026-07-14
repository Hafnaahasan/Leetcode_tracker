// Last updated: 7/14/2026, 2:16:02 PM
class Solution {
    public boolean isPalindrome(int x) {
          // code here
        int dp = x;
        int rev = 0;
        while(x != 0){
        int ld = x % 10;
        rev = (rev * 10) + ld;
        x = x / 10;
        }

        if(dp == rev && dp > -1){
            return true;
        }
        else{
            return false;
        }
    }
}