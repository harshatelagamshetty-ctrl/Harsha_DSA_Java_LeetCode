class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)||ch=='(') st.push(ch);
            else{
                while(st.size()!=0 && st.peek()!='(') sb.append(st.pop());
                st.pop();
                for(int j=0;j<sb.length();j++) {
                    st.push(sb.charAt(j));
                }
                sb.setLength(0);
            }
        }
        StringBuilder sbn=new StringBuilder();
        while(st.size()!=0) sbn.append(st.pop());
        return sbn.reverse().toString();
    }
}