class Solution {
    static class Pair{
        int val;
        int idx;
        Pair(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
    }
    public int[] twoSum(int[] arr, int target) {
        ArrayList<Pair>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(new Pair(arr[i],i));
        }
        Collections.sort(list,Comparator.comparingInt(p->p.val));
        int i=0;
        int j=list.size()-1;
        int[] res=new int[2];
        while(i<j){
            int sum=list.get(i).val+list.get(j).val;
            if(sum==target){
                res[0]=list.get(i).idx+1;
                res[1]=list.get(j).idx+1;
                i++;
                j--;
            }
            else if(sum>target) j--;
            else i++;
        }
        return res;
    }
}