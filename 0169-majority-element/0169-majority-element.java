class Solution {
    class Pair{
        int val;
        int idx;
        Pair(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
    }
    public int majorityElement(int[] arr) {
        Arrays.sort(arr);
        int i=0;
        int j=0;
        ArrayList<Pair> list=new ArrayList<>();
        while(j<arr.length){
            if(arr[i]==arr[j])j++;
            else{
                int freq=j-i;
                list.add(new Pair(arr[i],freq));
                i = j;
            }
        }
        int freq=j-i;
        list.add(new Pair(arr[i],freq));
        Collections.sort(list,Comparator.comparingInt(p->p.idx));
        return list.get(list.size()-1).val;
    }
}