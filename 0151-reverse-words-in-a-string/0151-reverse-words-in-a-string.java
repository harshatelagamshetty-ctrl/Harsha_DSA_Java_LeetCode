class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String [] arr=s.split("\\s+");
        String res="";
        for(int i=arr.length-1;i>=0;i--){
            res=res+arr[i]+" ";
        }
        res=res.trim();
        return res;
    }
}