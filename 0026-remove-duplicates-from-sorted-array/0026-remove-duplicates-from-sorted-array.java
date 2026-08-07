class Solution {
    public int removeDuplicates(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]) list.add(arr[i]);
        }
        list.add(arr[arr.length-1]);
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return list.size();
    }
}