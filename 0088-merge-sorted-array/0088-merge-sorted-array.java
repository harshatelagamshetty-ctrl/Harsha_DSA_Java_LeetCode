class Solution {
    public void merge(int[] arr, int m, int[] brr, int n) {
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<m&&j<n){
            if(arr[i]<brr[j]){
                list.add(arr[i++]);
            }
            else{
                list.add(brr[j++]);
            }
        }
        while(i<m) list.add(arr[i++]);
        while(j<n) list.add(brr[j++]);
        for(int a=0;a<list.size();a++) arr[a]=list.get(a);
    }
}