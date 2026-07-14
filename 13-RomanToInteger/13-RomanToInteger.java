// Last updated: 7/14/2026, 2:15:58 PM
class Solution {
    public int intVal(char ch){
        if(ch=='I') return 1;
        else if(ch=='V') return 5;
        else if(ch=='X') return 10;
        else if(ch=='L') return 50;
        else if(ch=='C') return 100;
        else if(ch=='D') return 500;
        else if(ch=='M') return 1000;
        else return 0;

    }
    public int romanToInt(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            int st=intVal(s.charAt(i));
            int nxt=intVal(s.charAt(i+1));
            if(st<nxt){
                sum -= st;
            }else{
                sum += st;
            }
            }
            sum += intVal(s.charAt(s.length()-1));
            return sum;
             
        }
        
    }

