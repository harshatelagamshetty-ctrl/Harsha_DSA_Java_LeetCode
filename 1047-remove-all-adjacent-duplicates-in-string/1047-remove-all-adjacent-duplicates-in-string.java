class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
             if(st.size()!=0 && st.peek()==ch ){
                st.pop();
            }
            else st.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        while(st.size()!=0) sb.append(st.pop());
        return sb.reverse().toString();
    }
}