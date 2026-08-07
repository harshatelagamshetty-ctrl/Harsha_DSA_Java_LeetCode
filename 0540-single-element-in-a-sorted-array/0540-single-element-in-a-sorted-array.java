class Solution {
    public int singleNonDuplicate(int[] arr) {
        int i=0;
        int j=0;
        while(j<arr.length){
            if(arr[i]==arr[j]) j++;
            else{
                int freq=j-i;
                if(freq==1) return arr[i];
                i = j;
            }
        }
        int freq=j-i;
        if(freq==1) return arr[i];
        return -1;  
    }
}