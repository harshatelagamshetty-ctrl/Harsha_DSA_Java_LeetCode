class Solution {
    public boolean backspaceCompare(String s, String t) {
        return compute(s).equals(compute(t));
    }
    public String compute(String s){
        Stack<Character> st=new Stack<>();
        if(s.charAt(0)!='#') st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.size()!=0 && ch=='#'){
                st.pop();
            }
            else if(ch=='#' && st.size()==0) continue;
            else st.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        while(st.size()!=0){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}