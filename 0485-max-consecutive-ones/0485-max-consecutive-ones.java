class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int i=0;
        int j=0;
        ArrayList<Integer>list=new ArrayList<>();
        while(j<arr.length){
            if(arr[i]==arr[j]) j++;
            else{
                int freq=j-i;
                if(arr[i]==1)list.add(freq);
                i = j;
            }
        }
        int freq=j-i;
        if(arr[i]==1)list.add(freq);
        if(list.size()==0) return 0;
        return Collections.max(list);
    }
}