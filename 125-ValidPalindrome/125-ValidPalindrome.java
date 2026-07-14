// Last updated: 7/14/2026, 2:15:31 PM
class Solution {
    public boolean isPalin(String s) {
        int i=0;
        int j=s.length()-1;

        while(i<j){
            if(s.charAt(i) !=s.charAt(j)) return false;

            i++;
            j--;
        }
        return true;
    }
    public boolean isPalindrome(String s){
        s=s.toLowerCase();
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if((ascii>=97&& ascii <=122)||(ascii >=48&& ascii<=57)){
                ans += ch;
            }
        }
        System.out.println(ans);
        return isPalin(ans);
    }
}
