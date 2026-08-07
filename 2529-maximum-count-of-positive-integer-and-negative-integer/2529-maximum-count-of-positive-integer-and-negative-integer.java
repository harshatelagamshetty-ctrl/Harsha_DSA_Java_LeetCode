class Solution {
    public int maximumCount(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int posIdx=-1;
        int negIdx=arr.length;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]<0){
                posIdx=mid;
                i=mid+1;
            }
            else if(arr[mid]>=0){
                j=mid-1;
            }
        }
        int a=0;
        int b=arr.length-1;

        while(a<=b){
            int mid=a+(b-a)/2;
            if(arr[mid]>0){
                negIdx=mid;
                b=mid-1;
            }
            else if(arr[mid]<=0){
                a=mid+1;
            }
        }

       int negCount = posIdx + 1;
int posCount = arr.length - negIdx;
        return Math.max(posCount,negCount);
    }
}