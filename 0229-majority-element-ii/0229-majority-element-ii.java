class Solution {
    static class Pair{
        int val;
        int freq;
        Pair(int val,int freq){
            this.val=val;
            this.freq=freq;
        }
    }
    public List<Integer> majorityElement(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(arr);
        int i=0;
        int j=0;
        while(j<arr.length){
            if(arr[i]==arr[j]) j++;
            else{
                int count=j-i;
                if(count>(arr.length/3)) list.add(arr[i]);
                i=j;
            }
        }
        int count=j-i;
        if(count>(arr.length/3)) list.add(arr[i]);
        return list;
    }
}