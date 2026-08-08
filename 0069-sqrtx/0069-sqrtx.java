class Solution {
    public int mySqrt(int n) {
        int i=1;
        int j=n;
        int idx=0;
        while(i<=j){
            int mid=i+(j-i)/2;
            if((long)mid*mid<=n){
                idx=mid;
                i=mid+1;
            }
            else j=mid-1;
        }
        return idx;
    }
}