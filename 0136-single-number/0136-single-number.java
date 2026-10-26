class Solution {
    public int singleNumber(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])) map.put(arr[i],1);
            else{
                int freq=map.get(arr[i]);
                map.put(arr[i],freq+1);
            }
        }
        for(int i:map.keySet()){
            int freq=map.get(i);
            if(freq==1) return i;
        }
        return -1;
    }
}