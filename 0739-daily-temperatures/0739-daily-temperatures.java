class Solution {
    class Pair{
        int val;
        int idx;
        Pair(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
    }
    public int[] dailyTemperatures(int[] arr) {
        Stack<Pair>st=new Stack<>();
        ArrayList<Integer>list=new ArrayList<>();
        st.push(new Pair(arr[arr.length-1],arr.length-1));
        list.add(0);
        for(int i=arr.length-2;i>=0;i--){
            if(st.peek().val>arr[i]) {
                list.add(st.peek().idx-i);
                st.push(new Pair(arr[i],i));
            }
            else{
                while(st.size()!=0 && arr[i]>=st.peek().val){
                    st.pop();
                }
                if(st.size()==0){
                    list.add(0);
                    st.push(new Pair(arr[i],i));
                }
                else{
                    list.add(st.peek().idx-i);
                    st.push(new Pair(arr[i],i));
                }
            }
        }
        Collections.reverse(list);
        int res[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}