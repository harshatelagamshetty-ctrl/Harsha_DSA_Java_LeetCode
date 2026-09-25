class Solution {
    public int[] getAverages(int[] arr, int k) {
        if(arr.length<2*k+1){
            int[] res=new int[arr.length];
            for(int i=0;i<res.length;i++) res[i]=-1;
            return res;
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=1;i<=k;i++) list.add(-1);
        long sum=0;
        for(int i=0;i<=2*k;i++) {
            sum=sum+arr[i];
        }
        list.add((int)(sum/(2*k+1)));
        for(int i=2*k+1;i<arr.length;i++){
            sum=sum+arr[i];
            sum=sum-arr[i-(2*k+1)];
            list.add((int)(sum/(2*k+1)));
        }
        for(int i=1;i<=k;i++) list.add(-1);
        int[] res=new int[list.size()];
        for(int i=0;i<res.length;i++) res[i]=list.get(i);
        return res;
    }
}