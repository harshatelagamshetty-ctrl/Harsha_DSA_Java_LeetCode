class Solution {
    class Map{
        int val;
        int idx;
        Map(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
    }
    public int[] twoSum(int[] arr, int target) {
        List<Map> m=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            m.add(new Map(arr[i],i));
        }
        int res[]=new int [2];
        Collections.sort(m,Comparator.comparingInt(p->p.val));
        int i=0;
        int j=m.size()-1;
        while(i<=j){
            int sum=m.get(i).val+m.get(j).val;
            if(sum<target) i++;
            else if(sum>target) j--;
            else{
                res[0]=m.get(i).idx;
                res[1]=m.get(j).idx;
                break;
            }
        }
        return res;

    }
}