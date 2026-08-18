class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch==')'|| ch=='}'|| ch==']') && st.size()==0) return false;
            else if( (ch==')'|| ch=='}'|| ch==']') && !isCategory(ch,st.peek())) return false;
            else if((ch==')'|| ch=='}'|| ch==']') && isCategory(ch,st.peek()) && st.size()!=0){
                st.pop();
            }
            else if(ch=='{'|| ch=='('|| ch=='[') st.add(ch);
        }
        if(st.size()==0) return true;
        else return false;
    }
    public boolean isCategory(char c1,char c2){
        if(c1==')'&& c2=='(' ) return true;
        if(c1=='}'&& c2=='{' ) return true;
        if(c1==']'&& c2=='[' ) return true;
        return false;
    }
}