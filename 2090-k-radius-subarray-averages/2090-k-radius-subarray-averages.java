class Solution {
    public int[] getAverages(int[] arr, int r) {
        if(r==0) return arr;
        if(2*r+1>arr.length) {
        int[] res = new int[arr.length];
        for(int i=0;i<res.length;i++) res[i]=-1;
        return res;
}
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=r;i++) list.add(-1);
        long sum=0;
        for(int i=0;i<=2*r;i++){
            sum=sum+arr[i];
        }
        list.add((int)(sum/(2*r+1)));
        for(int i=2*r+1;i<arr.length;i++){
            sum=sum+arr[i]-arr[i-(2*r+1)];
            list.add((int)(sum/(2*r+1)));
        }
        while(list.size()!=arr.length) list.add(-1);
        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i]=list.get(i); 
        }
        return res;

    }
}