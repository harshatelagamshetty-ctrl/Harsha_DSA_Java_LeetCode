class Solution {
    public int majorityElement(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int freq=map.get(arr[i]);
                map.put(arr[i],freq+1);
            }
            else map.put(arr[i],1
            );
        }
        int target=arr.length/2;
        for(int i:map.keySet()){
            int freq=map.get(i);
            if(freq>target) return i;
        }
        return -1;
    }
}