class Solution {
    public int[] nextGreaterElements(int[] arr) {
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            st.push(arr[i]);
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=st.peek()){
                while(st.size()!=0 && arr[i]>=st.peek()) st.pop();
                if(st.size()==0){
                    list.add(-1);
                    st.add(arr[i]);
                }
                else{
                    list.add(st.peek());
                    st.push(arr[i]);
                }
            }
            else{
                list.add(st.peek());
                st.push(arr[i]);
            }
        }
        Collections.reverse(list);
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}