class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(st.size()==0) st.push(s.charAt(i));
            else if(s.charAt(i)!=st.peek()) st.push(s.charAt(i));
            else{
                while(st.size()!=0 && st.peek()==s.charAt(i)) st.pop();
            }
        }
        String str="";
        while(st.size()!=0) str=str+st.pop();
        String res=new StringBuilder(str).reverse().toString();
        return res;
    }
}