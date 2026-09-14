class Solution {
    public void rotate(int[] arr, int k) {
        int n=arr.length;
        k=k%n;
        reverseArray(arr,0,arr.length-1);
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,arr.length-1);
    }
    public void reverseArray(int[] arr,int x,int y){
        while(x<y){
            int temp=arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
            x++;
            y--;
        }
    }
}