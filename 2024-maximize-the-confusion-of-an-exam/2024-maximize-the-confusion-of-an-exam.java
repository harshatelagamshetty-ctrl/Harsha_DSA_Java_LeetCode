class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
        // max consecutive T's
        int tmax=0;
        int i=0;
        int j=0;
        int tcount=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(ch=='T') j++;
            else if(ch=='F' && tcount<k){
                tcount++;
                j++;
            }
            else if(ch=='F' && tcount>=k){
                tmax=Math.max(tmax,j-i);
                while(s.charAt(i)=='T') i++;
                i++;
                tcount--;
            }
        }
        tmax=Math.max(tmax,j-i);

        // max consecutive F's
        int fmax=0;
        int a=0;
        int b=0;
        int fcount=0;
        while(b<s.length()){
            char ch=s.charAt(b);
            if(ch=='F') b++;
            else if(ch=='T' && fcount<k){
                fcount++;
                b++;
            }
            else if(ch=='T' && fcount>=k){
                fmax=Math.max(fmax,b-a);
                while(s.charAt(a)=='F') a++; 
                a++;
                fcount--;
            }
        } 
        fmax=Math.max(fmax,b-a);
        return Math.max(tmax,fmax);
    }
}