class Solution {
    public int findMin(int[] arr) {
        int p=pivotIdx(arr);
        return Math.min(arr[0],arr[p]);
    }
    public int pivotIdx(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) return i+1;
        }
        return 0;
    }
}