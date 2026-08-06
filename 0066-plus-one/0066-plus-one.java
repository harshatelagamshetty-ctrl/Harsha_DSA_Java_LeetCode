class Solution {
    public int[] plusOne(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        int carry=1;
        for(int i=arr.length-1;i>=0;i--){
            if(carry+arr[i]>9){
                carry=1;
                list.add(0);
            }
            else if(carry+arr[i]<=9) {
                list.add(carry+arr[i]);
                carry=0;
            }
        }
        if(carry==1) list.add(1);
        int[] res =new int[list.size()];
        for(int i=list.size()-1;i>=0;i--){
            res[list.size()-1-i]=list.get(i);
        }
        return res;
    }
}