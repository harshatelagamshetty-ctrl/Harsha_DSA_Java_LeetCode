class Solution {
    public int[] rearrangeArray(int[] arr) {
        ArrayList<Integer>pos=new ArrayList<>();
        ArrayList<Integer>neg=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0) pos.add(arr[i]);
            else neg.add(arr[i]);
        }
        int i=0;
        int j=0;
        int idx=0;
        int[] res=new int[arr.length];
        while(i<pos.size() && j<neg.size()){
            res[idx]=pos.get(i);
            i++;
            idx++;
            res[idx]=neg.get(j);
            j++;
            idx++;
        }
        return res;
    }
}