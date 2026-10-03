class Solution {
    public int[] finalPrices(int[] arr) {
        // next smaller or equal
        ArrayList<Integer>list=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        st.push(arr[arr.length-1]);
        list.add(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>st.peek()){
                list.add(arr[i]-st.peek());
                st.push(arr[i]);
            }
            else{
                while(st.size()!=0 && arr[i]<st.peek()) st.pop();
                if(st.size()==0){
                    list.add(arr[i]);
                    st.push(arr[i]);
                }
                else{
                    list.add(arr[i]-st.peek());
                    st.push(arr[i]);
                }
            }
        }
        Collections.reverse(list);
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++) res[i]=list.get(i);
        return res;
    }
}