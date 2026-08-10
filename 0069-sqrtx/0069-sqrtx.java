class Solution {
    public int mySqrt(int x) {
        long i=1;
        long j=x;
        long idx=0;
        while(i<=j){
            long mid=i+(j-i)/2;
            if((long)mid*mid==x) return (int)mid;
            else if((long)mid*mid<x){
                idx=mid;
                i=mid+1;
            }
            else if((long)mid*mid>x) j=mid-1;
        }
        return (int)idx;
    }
}