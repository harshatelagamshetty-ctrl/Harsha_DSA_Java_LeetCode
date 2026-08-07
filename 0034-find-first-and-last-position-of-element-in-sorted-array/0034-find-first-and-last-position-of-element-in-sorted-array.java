class Solution {
    public int[] searchRange(int[] arr, int target) {
        int i=0;
        int j=arr.length-1;
        int idx1=-1;
        int idx2=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==target){
                idx1=mid;
                j=mid-1;
            }
            else if(arr[mid]<target){
                i=mid+1;
            }
            else j=mid-1;
        }

        int a=0;
        int b=arr.length-1;
        while(a<=b){
            int mid=a+(b-a)/2;
            if(arr[mid]==target) {
                idx2=mid;
                a=mid+1;
            }
            else if(arr[mid]<target) {
                a=mid+1;
            }
            else b=mid-1;
        }
        int res[]=new int [2];
        res[0]=idx1;
        res[1]=idx2;
        return res;
    }
}