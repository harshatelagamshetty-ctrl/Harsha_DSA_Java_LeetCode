class Solution {
    public int minimumRecolors(String s, int k) {
        ArrayList<Integer>list=new ArrayList<>();
        int wcount=0;
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='W') wcount++;
        }
        list.add(wcount);
        for(int i=k;i<s.length();i++){
            if(s.charAt(i)=='W') wcount=wcount+1;
            if(s.charAt(i-k)=='W') wcount=wcount-1;
            list.add(wcount);
        }
        return Collections.min(list);
    }
}