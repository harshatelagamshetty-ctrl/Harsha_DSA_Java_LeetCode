class Solution {
    public int maxSubarrayLength(int[] arr, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        int j=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        while(j<arr.length){
            if(map.getOrDefault(arr[j],0)<k){
                map.put(arr[j],map.getOrDefault(arr[j],0)+1); 
                j++;
            }
            else{
                list.add(j-i);
                while(arr[i]!=arr[j]){
                    int freq=map.get(arr[i]);
                    map.put(arr[i],freq-1);
                    if(freq==0) map.remove(arr[i]);
                    i++;
                }
                int freq=map.get(arr[j]);
                map.put(arr[j],freq-1);
                if(freq==0) map.remove(arr[j]);
                i++;
            }
        }
        list.add(j-i);
        return Collections.max(list);
    }
}