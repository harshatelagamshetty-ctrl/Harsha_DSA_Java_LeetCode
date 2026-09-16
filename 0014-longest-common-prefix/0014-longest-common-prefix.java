class Solution {
    public String longestCommonPrefix(String[] arr) {
        ArrayList<String>list=new ArrayList<>();
        for(String x:arr) list.add(x);
        while(list.size()!=1){
            String temp=common(list.get(0),list.get(1));
            list.remove(0);
            list.remove(0);
            list.add(temp);
        }
        return list.get(0);
    }
    public String common(String a,String b){
        int i=0;
        int j=0;
        StringBuilder sb=new StringBuilder();
        while(i<a.length()&&j<b.length()){
            if(a.charAt(i)==b.charAt(j)) {
                sb.append(a.charAt(i));
                i++;
                j++;
            }
            else break;
        }
        return sb.toString();
    }
}