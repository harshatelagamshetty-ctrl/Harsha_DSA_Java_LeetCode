class Solution {
    public int search(int[] arr, int target) {
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]<target)i=mid+1;
            else if(arr[mid]>target) j=mid-1;
            else return mid;
        }
        return -1;
    }
}