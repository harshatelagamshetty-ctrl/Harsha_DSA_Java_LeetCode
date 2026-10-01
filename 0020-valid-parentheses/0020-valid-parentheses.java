class Solution {
    public boolean isValid(String s) {
        HashSet<Character>openSet=new HashSet<>();
        HashSet<Character>closeSet=new HashSet<>();
        openSet.add('(');
        openSet.add('{');
        openSet.add('[');

        closeSet.add(')');
        closeSet.add('}');
        closeSet.add(']');

        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.size()==0 && openSet.contains(ch)) st.push(ch);
            else if(openSet.contains(ch)) st.push(ch);
            else if(st.size()==0 && closeSet.contains(ch)) return false;
            else if(closeSet.contains(ch) && sameType(ch,st.peek()) && st.size()!=0) st.pop();
            else if(closeSet.contains(ch) && !sameType(ch,st.peek())) return false;
        }

        if(st.size()==0) return true;
        else return false;
    }
    public boolean sameType(char c1,char c2){
        if(c1==')' && c2=='(') return true;
        if(c1==']' && c2=='[') return true;
        if(c1=='}' && c2=='{') return true;
        return false;
    }
}