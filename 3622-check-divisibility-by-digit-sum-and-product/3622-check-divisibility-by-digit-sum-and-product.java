class Solution {
    public boolean checkDivisibility(int n) {
        int digit_prod=1;
        int digit_sum=0;
        int temp=n;
        while(temp!=0){
            int digit=temp%10;
            digit_prod=digit_prod*digit;
            digit_sum=digit_sum+digit;
            temp=temp/10;
        }
        int total=digit_prod+digit_sum;
        if(n%total==0) return true;
        return false;
    }
}