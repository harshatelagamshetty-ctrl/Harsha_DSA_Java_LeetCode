class Solution {
    public boolean check(int[] arr) {
        ArrayList<Integer>list=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[(i+1)%arr.length]) list.add(i);
        }
        int n=list.size();
        if(n==1||n==0) return true;
        return false;
    }
}