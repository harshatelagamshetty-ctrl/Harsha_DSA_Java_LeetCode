class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list=new ArrayList<>();
        HashSet<List<Integer>> set=new HashSet<>();
        for(int i=0;i<arr.length-2;i++){
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                int sum=arr[j]+arr[k]+arr[i];
                if(sum<0) j++;
                else if(sum>0) k--;
                else{
                    set.add(Arrays.asList(arr[i],arr[j],arr[k])); 
                    j++;
                    k--;
                }
            }
        }
        for(List<Integer> x:set) list.add(x);
        return list;
    }
}