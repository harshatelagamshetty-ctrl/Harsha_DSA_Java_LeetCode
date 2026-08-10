class Solution {
    public boolean isPerfectSquare(int x) {
        long i=1;
        long j=x;
        long idx=0;
        while(i<=j){
            long mid=i+(j-i)/2;
            if((long)mid*mid==x) return true;
            else if((long)mid*mid<x){
                i=mid+1;
            }
            else if((long)mid*mid>x) j=mid-1;
        }
        return false;
    }
}