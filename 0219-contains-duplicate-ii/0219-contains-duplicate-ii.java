class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int oldIdx=map.get(arr[i]);
                if(Math.abs(oldIdx-i)<=k) return true;
                else map.put(arr[i],i); 
            }
            else map.put(arr[i],i);
        }
        return false;
    }
}