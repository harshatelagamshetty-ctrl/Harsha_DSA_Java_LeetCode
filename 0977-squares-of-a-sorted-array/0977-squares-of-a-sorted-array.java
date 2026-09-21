class Solution {
    public int[] sortedSquares(int[] arr) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            list.add(arr[i]*arr[i]);
        }
        Collections.sort(list);
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++) res[i]=list.get(i);
        return res;
    }
}