class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        ArrayList<Long>list=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        long sum=0;
        for(int i=0;i<k;i++) {
            sum+=arr[i];
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        if(map.size()==k) list.add(sum);

        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i]-arr[i-k];
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            int freq=map.get(arr[i-k]);
            freq=freq-1;
            map.put(arr[i-k],freq);
            if(freq==0){
                map.remove(arr[i-k]);
            }
            if(map.size()==k) list.add(sum);
        }
        if(list.size()==0) return 0;
        return Collections.max(list);

    }
}