// Last updated: 7/14/2026, 2:15:07 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
            }else{
                char[] arr1=s.toCharArray();
                char[] arr2=t.toCharArray();
                Arrays.sort(arr1);
                Arrays.sort(arr2);
                if(Arrays.equals(arr1,arr2)){
                    return true;
                }else{
                    return false;
                }
            }
    }
}