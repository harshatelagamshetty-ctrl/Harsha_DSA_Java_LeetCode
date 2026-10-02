class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        long max=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        long sum=0;
        for(int i=0;i<k;i++) {
            sum+=arr[i];
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        if(map.size()==k) max=Math.max(max,sum);

        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i]-arr[i-k];
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            int freq=map.get(arr[i-k]);
            freq=freq-1;
            map.put(arr[i-k],freq);
            if(freq==0){
                map.remove(arr[i-k]);
            }
            if(map.size()==k) max=Math.max(max,sum);
        }
        return max;
    }
}