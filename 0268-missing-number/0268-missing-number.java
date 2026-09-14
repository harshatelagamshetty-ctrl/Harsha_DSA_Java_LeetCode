class Solution {
    static class Pair{
        int val;
        int idx;
        Pair(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
    }
    public int missingNumber(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Pair>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(new Pair(arr[i],i));
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i).val!=list.get(i).idx) return i;
        }
        return arr.length;
    }
}