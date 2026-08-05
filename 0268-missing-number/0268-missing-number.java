class Solution {
    public int missingNumber(int[] arr){
        Arrays.sort(arr);
        List<Pair>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(new Pair(arr[i],i));
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i).val!=list.get(i).idx) return list.get(i).idx;
        }
        return arr.length;

    }
    class Pair{
        int val;
        int idx;
        Pair(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
    }
}