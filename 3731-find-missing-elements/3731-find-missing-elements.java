class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=arr[0];i<arr[arr.length-1];i++){
            if(isPresent(i,arr)==false) list.add(i);
        }
        return list;
    }
    public boolean isPresent(int x, int[] arr){
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x) {
                flag=1;
                return true;
            }
        }
        return false;
    }
}