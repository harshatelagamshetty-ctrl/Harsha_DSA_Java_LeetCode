class Solution {
    public int longestSubarray(int[] arr) {
        ArrayList<Integer>list=new ArrayList<>();
        int i=0;
        int j=0;
        int count=0;
        while(j<arr.length){
            if(arr[j]==1) j++;
            else if(arr[j]==0 && count==0){
                count++;
                j++;
            }
            else if(arr[j]==0 && count>0){
                list.add(j-i);
                while(arr[i]!=0) i++;
                i++;
                count--;
            }
        }
        list.add(j-i);
        return Collections.max(list)-1;
    }
}