class Solution {
    public int maximumUniqueSubarray(int[] arr) {
        ArrayList<Integer>list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        int i=0;
        int j=0;
        while(j<arr.length){
            if(!set.contains(arr[j])){
                sum=sum+arr[j];
                set.add(arr[j]);
                j++;
            }
            else{
                list.add(sum);
                while(arr[i]!=arr[j]){
                    sum=sum-arr[i];
                    set.remove(arr[i]);
                    i++;
                }
                sum=sum-arr[i];
                set.remove(arr[i]);
                i++;
            }
        }
        // sum=sum-arr[i];
        list.add(sum);
        return Collections.max(list);
    }
}