class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int i=0;
        int j=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(j<arr.length){
            if(arr[j]==1) j++;
            else{
                int freq=j-i;
                list.add(freq);
                j++;
                i = j;
            }
        }
        int freq=j-i;
        list.add(freq);
        i = j;

        return Collections.max(list);
    }
}