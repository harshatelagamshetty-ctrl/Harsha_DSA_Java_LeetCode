class Solution {
    public String reverseWords(String s) {
        ArrayList<String> list=new ArrayList<>();
        String[] arr=s.split("\\s+");
        for(int i=0;i<arr.length;i++){
            list.add(new StringBuilder(arr[i]).reverse().toString());
        }
        String res="";
        for(String str:list) res=res+str+" ";
        res=res.trim();
        return res;
    }
}