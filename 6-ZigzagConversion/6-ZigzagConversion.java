// Last updated: 7/14/2026, 2:16:05 PM
class Solution {
    public String convert(String s, int numR) {
        if(numR == 1 || numR >= s.length()){
            return s;
        }
        int idx=0,d=1;
        List<Character>[] rows = new ArrayList[numR];
        for(int i=0;i<numR;i++){
            rows[i] = new ArrayList<>();
        }
        for(char c: s.toCharArray()){
            rows[idx].add(c);
            if(idx == 0){
                d=1;
            }else if(idx == numR-1){
                d = -1;
            }
            idx += d;
        }
        StringBuilder res = new StringBuilder();
        for(List<Character> row:rows){
            for(char c:row){
                res.append(c);
            }
        }
        return res.toString();
    }
}