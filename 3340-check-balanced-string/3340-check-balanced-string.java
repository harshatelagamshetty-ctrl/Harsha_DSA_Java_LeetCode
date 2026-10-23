class Solution {
    public boolean isBalanced(String s) {
        int esum=0;
        int osum=0;
        for(int i=0;i<s.length();i++){
            String res=s.charAt(i)+"";
            int digit=Integer.parseInt(res);
            if(i%2==0){
                esum+=digit;
            }
            else osum+=digit;
        }
        return esum==osum;
    }
}