class Solution {
    public double findMaxAverage(int[] arr, int k) {
        ArrayList<Double> list=new ArrayList<>();
        double sum=0;
        for(int i=0;i<k;i++) sum=sum+arr[i];
        list.add(sum/k);
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i];
            sum=sum-arr[i-k];
            list.add(sum/k);
        }
        return Collections.max(list);
    }
}