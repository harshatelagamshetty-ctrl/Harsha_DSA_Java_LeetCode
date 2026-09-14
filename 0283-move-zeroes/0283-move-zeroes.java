class Solution {
    public void moveZeroes(int[] arr) {
        int i=0;
        int j=0;
        while(j<arr.length){
            if(arr[j]!=0){
                arr[i]=arr[j];
                j++;
                i++;
            }
            else j++;
        }
        for(int x=i;x<arr.length;x++) arr[x]=0;
    }
}