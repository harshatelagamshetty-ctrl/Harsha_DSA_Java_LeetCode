class Solution {
    public boolean check(int[] arr) {
        int pivotIdx=-1;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                pivotIdx=i;
                break;
            }

        }
        if(pivotIdx==-1) return true;
        for(int i=pivotIdx+1;i<arr.length;i++){
            list.add(arr[i]);
        }
        for(int i=0;i<=pivotIdx;i++) list.add(arr[i]);
        boolean sorted = true;

        for (int i=0; i<list.size()-1;i++) {
            if(list.get(i)>list.get(i+1)) {
                sorted = false;
                return false;
            }
        }
        return true;
    }
}