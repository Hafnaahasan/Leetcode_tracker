// Last updated: 7/14/2026, 2:14:35 PM
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[][] sor=new int[n][2];
        for(int i=0;i<n;i++)sor[i] = new int[] {i,score[i]};

        Arrays.sort(sor,(x,y)->(y[1]-x[1]));
        String[] ans = new String[n];
        for(int i=0;i<n;i++){
            if(i==0){
                ans[sor[i][0]]="Gold Medal";
            }else if(i==1){
                ans[sor[i][0]]="Silver Medal";
        }else if(i==2){
                ans[sor[i][0]]="Bronze Medal";
            }else{
                ans[sor[i][0]]=String.valueOf(i+1);
            }
        }
        return ans;
    }
}