// Last updated: 7/14/2026, 2:15:24 PM
class Solution {
    public String convertToTitle(int colNum) {
        StringBuilder res = new StringBuilder();
        while(colNum >0){
            colNum--;
            res.insert(0,(char)((colNum %26)+'A'));
            colNum /= 26;
        }
        return res.toString();
    }
}