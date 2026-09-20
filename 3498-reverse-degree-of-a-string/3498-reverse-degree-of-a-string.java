class Solution {
    public int reverseDegree(String s) {
        s=s.trim();
        int sum=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int original=ch-'a'+1;
            int reversed=27-original;
            int idx=i+1;
            sum=sum+reversed*idx;
        }
        return sum;
    }
}