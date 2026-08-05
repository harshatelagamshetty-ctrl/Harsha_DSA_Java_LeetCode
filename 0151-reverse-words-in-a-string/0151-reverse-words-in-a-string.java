class Solution {
    public String reverseWords(String s) {
        s.trim();
        String arr[]=s.split("\\s+");
        String ans[]=new String[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            ans[arr.length-1-i]=arr[i];
        }
        String res="";
        for(int i=0;i<ans.length;i++){
            res=res+ans[i]+" ";
        }
        res=res.trim();
        return res;

    }
}