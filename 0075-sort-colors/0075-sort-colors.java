class Solution {
    public void sortColors(int[] arr) {
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) count0++;
            else if(arr[i]==1) count1++;
            else if(arr[i]==2) count2++;
        }
        int idx=0;
        for(int  i=1;i<=count0;i++){
            arr[idx]=0;
            idx++;
        }
        for(int  i=1;i<=count1;i++){
            arr[idx]=1;
            idx++;
        }
        for(int  i=1;i<=count2;i++){
            arr[idx]=2;
            idx++;
        }
    }
}