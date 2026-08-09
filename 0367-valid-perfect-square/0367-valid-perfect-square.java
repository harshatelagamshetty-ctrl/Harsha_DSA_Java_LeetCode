class Solution {
    public boolean isPerfectSquare(int n) {
        long i=1;
        long j=n;
        long idx=0;
        while(i<=j){
            long mid=i+(j-i)/2;
            if((long)mid*mid==n) return true;
            else if((long)mid*mid<n) i=mid+1;
            else j=mid-1;   
        }
        return false;
    }
}