class Solution {
    public int singleNumber(int[] arr) {
        Arrays.sort(arr);
        int i=0;
        while(i<arr.length-1){
            if(arr[i]!=arr[i+1]) return arr[i];
            else i=i+2;
        }
        return arr[arr.length-1];
    }
}