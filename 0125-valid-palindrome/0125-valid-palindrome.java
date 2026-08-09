class Solution {
    public boolean isPalindrome(String str) {
        String s="";
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))|| Character.isDigit(str.charAt(i))) s=s+str.charAt(i);
        }
        s=s.toLowerCase();
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}