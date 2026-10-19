class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
        Arrays.sort(arr);
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) list.add(i);
        }
        return list;
    }
}