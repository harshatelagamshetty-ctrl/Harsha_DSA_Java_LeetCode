class Solution {
    public int longestSubarray(int[] arr) {
        int max=0;
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
                max=Math.max(max,j-i);
                while(arr[i]!=0) i++;
                i++;
                count--;
            }
        }
        max=Math.max(max,j-i);
        return max-1;
    }
}