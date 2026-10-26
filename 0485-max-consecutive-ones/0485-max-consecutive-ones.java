class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int i=0;
        int j=0;
        int max=0;
        while(j<arr.length){
            if(arr[j]==1 ) j++;
            else{
                int freq=j-i;
                max=Math.max(freq,max);
                j++;
                i = j;
            }
        }
        int freq=j-i;
        max=Math.max(freq,max);
        return max;
    }
}