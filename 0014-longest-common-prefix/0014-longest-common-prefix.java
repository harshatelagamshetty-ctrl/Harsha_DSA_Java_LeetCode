class Solution {
    public String longestCommonPrefix(String[] strs) {
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            list.add(strs[i]);
        }
        while(list.size()!=1){
            list.add(commonOf(list.get(0),list.get(1)));
            list.remove(0);
            list.remove(0);
        }
        return list.get(0);
    }
    public String commonOf(String s1,String s2){
        int i=0;
        int j=0;
        String res="";
        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                res=res+s1.charAt(i);
                i++;
                j++;
            }
            else break;
        }
        return res;
    }
}