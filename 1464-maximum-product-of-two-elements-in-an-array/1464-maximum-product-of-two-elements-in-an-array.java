class Solution {
    public int maxProduct(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        return Math.max((arr[n-1]-1)*(arr[n-2]-1),(arr[0]-1)*(arr[1]-1));
    }
}