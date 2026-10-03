class Solution {
    public int maxDepth(String s) {
        int count=0;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                count++;
                list.add(count);
            }
            else if(ch==')') count--;
        }
        if(list.size()==0) return 0;
        return Collections.max(list);
    }
}