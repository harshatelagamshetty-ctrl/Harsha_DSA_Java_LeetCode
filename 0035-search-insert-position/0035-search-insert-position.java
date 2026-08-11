class Solution {
    public int searchInsert(int[] arr, int target) {
        int i=0;
        int j=arr.length-1;
        int idx=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]<target){
                idx=mid;
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return idx+1;
    }
}