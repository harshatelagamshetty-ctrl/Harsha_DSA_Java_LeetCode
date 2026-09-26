class Solution {
    public boolean checkInclusion(String s1, String s) {
        if(s1.length()>s.length()) return false;
        int k=s1.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<k;i++) sb.append(s.charAt(i));
        if(isPermutation(sb.toString(),s1)) return true;
        for(int i=k;i<s.length();i++){
            sb.deleteCharAt(0);
            sb.append(s.charAt(i));
            if(isPermutation(sb.toString(),s1)) return true;
        }
        return false;
    }
    public boolean isPermutation(String a,String b){
        if(a.length()!=b.length()) return false;
        int[] freq=new int[26];
        for(int i=0;i<a.length();i++){
            freq[a.charAt(i)-'a']++;
            freq[b.charAt(i)-'a']--;
        }
        for(int x:freq){
            if(x!=0) return false;
        }
        return true;
    }
}