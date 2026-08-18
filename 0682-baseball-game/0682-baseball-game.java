class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(!arr[i].equals("C") && !arr[i].equals("D") && !arr[i].equals("+")){
                st.push(Integer.parseInt(arr[i]));
            }
            else if(arr[i].equals("C")) st.pop();
            else if(arr[i].equals("D")) st.push(2*st.peek());
            else if(arr[i].equals("+")){
                int x=st.pop();
                int y=st.pop();
                st.push(y);
                st.push(x);
                st.push(x+y);
            }
        }
        int sum=0;
        while(st.size()!=0){
            sum=sum+st.pop();
        }
        return sum;
    }
}