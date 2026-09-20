class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        s=s.trim();
        s=s.toLowerCase();
        if(s==null) return true;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)||Character.isLetter(ch)) sb.append(ch);
        }
        return checkPalindrome(sb.toString());
    }
    public boolean checkPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}