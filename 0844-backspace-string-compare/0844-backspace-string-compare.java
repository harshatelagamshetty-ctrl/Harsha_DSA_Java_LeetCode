class Solution {
    public boolean backspaceCompare(String s, String t) {
        return simplify(s).equals(simplify(t));
    }
    public String simplify(String s){
        Stack<Character> st=new Stack<>();
        if(s.charAt(0)!='#') st.push(s.charAt(0));
        
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='#' && st.size()!=0) st.pop();
            else if(st.size()==0 && s.charAt(i)=='#') continue;
            else st.push(s.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        while(st.size()!=0){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}