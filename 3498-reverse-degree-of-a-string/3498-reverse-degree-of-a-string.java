class Solution {
    public int reverseDegree(String s) {
        s=s.trim();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int original=ch-'a'+1;
            int reversed=27-original;
            int idx=i+1;
            list.add(reversed*idx);
        }
        int sum=0;
        for(int i=0;i<list.size();i++) sum=sum+list.get(i);
        return sum;
    }
}