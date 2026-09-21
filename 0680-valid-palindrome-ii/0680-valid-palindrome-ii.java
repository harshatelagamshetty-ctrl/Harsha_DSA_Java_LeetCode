class Solution {
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                StringBuilder sb=new StringBuilder(s);
                sb.deleteCharAt(i);
                if(isPalindrome(sb)==true) return true;
                else{
                    sb.insert(i,s.charAt(i));
                    sb.deleteCharAt(j);
                    if(isPalindrome(sb)==true) return true;
                }
                return false;
            }
        }
        return true;
    }
    public boolean isPalindrome(StringBuilder sb){
        int i=0;
        int j=sb.length()-1;
        while(i<j){
            if(sb.charAt(i)!=sb.charAt(j)) return false;
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}