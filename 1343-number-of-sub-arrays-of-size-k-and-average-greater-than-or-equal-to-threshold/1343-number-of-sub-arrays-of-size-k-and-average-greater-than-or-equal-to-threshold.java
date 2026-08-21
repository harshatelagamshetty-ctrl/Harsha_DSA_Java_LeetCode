class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        ArrayList<Integer> list=new ArrayList<>();
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        list.add(sum/k);
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i]-arr[i-k];
            list.add(sum/k);
        }
        int count=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>=threshold) count++;
        }
        return count;
    }
}