class Solution {
    public String compressedString(String s) {
        int i=0;
        int j=0;
        String res="";
        while(i<s.length()){
            while(j<s.length() && s.charAt(i)==s.charAt(j)){
                j++;
            }
            int freq=j-i;
        while(freq > 9){
            res += "9";
            res += s.charAt(i);
            freq -= 9;
            }
res += freq;
res += s.charAt(i);
           
            i=j;
        }
        return res;
    }
}