class Solution {
    public int totalFruit(int[] arr) {
        ArrayList<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        int i=0;
        int j=0;
        while(j<arr.length){
            if(map.size()==2 && !map.containsKey(arr[j])){
                list.add(j-i);
                while(map.size()!=1){
                    int freq=map.get(arr[i]);
                    if(freq-1==0) map.remove(arr[i]);
                    else map.put(arr[i],freq-1);
                    i++;
                }
            }
            else{
                map.put(arr[j],map.getOrDefault(arr[j],0)+1);
                j++;
            }
        }
        list.add(j-i);
        return Collections.max(list);
    }
}