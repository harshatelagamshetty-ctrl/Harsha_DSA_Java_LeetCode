class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> list=new ArrayList<>();
        HashSet<List<Integer>> set=new HashSet<>();
        for(int i=0;i<arr.length-3;i++){
            for(int j=i+1;j<arr.length-2;j++){
                int k=j+1;
                int l=arr.length-1;
                while(k<l){
                    long sum=(long)arr[i]+arr[j]+arr[k]+arr[l];
                    if(sum<target) k++;
                    else if(sum>target) l--;
                    else{
                        set.add(Arrays.asList(arr[i],arr[j],arr[k],arr[l]));
                        k++;
                        l--;
                    }
                }
            }
        }
        for(List<Integer> x:set) list.add(x);
        return list;
    }
}