class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx=ch-'a';
            freq1[idx]++;
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            int idx=ch-'a';
            freq2[idx]++;
        }
        int i=0;
        int j=0;
        while(i<freq1.length){
            if(freq1[i]!=freq2[j]) return false;
            else {
                i++;
                j++;
            }
        }
        return true;
    }
}