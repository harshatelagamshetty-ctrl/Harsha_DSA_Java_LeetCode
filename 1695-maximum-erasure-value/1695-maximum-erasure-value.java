class Solution {
    public int maximumUniqueSubarray(int[] arr) {
        HashSet<Integer>set=new HashSet<>();
        int max=0;
        int i=0;
        int j=0;
        int sum=0;
        ArrayList<Integer>list=new ArrayList<>();
        while(j<arr.length){
            if(!set.contains(arr[j])){
                set.add(arr[j]);
                sum=sum+arr[j];
                j++;
            }
            else{
                while(arr[i]!=arr[j]){
                    list.add(sum);
                    sum=sum-arr[i];
                    set.remove(arr[i]);
                    i++;
                }
                sum=sum-arr[i];
                set.remove(arr[i]);
                i++;
            }
        }
        list.add(sum);
        return Collections.max(list);
    }
}