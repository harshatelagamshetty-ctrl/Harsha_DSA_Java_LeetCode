class Solution {
    public int smallestNumber(int n, int t) {
        int temp=n;
        while(temp>=n){
            if (digitProd(temp)%t==0) return temp;
            temp++;
        }
        return -1;
    }
    public int digitProd(int x){
        int temp=x;
        int prod=1;
        while(temp!=0){
            prod=prod*(temp%10);
            temp=temp/10;
        }
        return prod;
    }
}