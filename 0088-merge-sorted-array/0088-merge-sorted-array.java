class Solution {
    public void merge(int[] arr, int m, int[] brr, int n) {
        int i=0;
        int j=0;
        int k=0;
        int[] res=new int[arr.length];
        while(i<m && j<n){
            if(arr[i]<brr[j]) {
                res[k]=arr[i];
                i++;
                k++;
            }
            else if(arr[i]>brr[j]){
                res[k]=brr[j];
                j++;
                k++;
            }
            else if (arr[i]==brr[j]){
                res[k]=arr[i];
                i++;
                k++;
                res[k]=brr[j];
                k++;
                j++;
            }
        }

        while(i<m){
            res[k]=arr[i];
            i++;
            k++;
        }
        while(j<n){
            res[k]=brr[j];
            j++;
            k++;
        }

        for(int a=0;a<arr.length;a++){
            arr[a]=res[a];
        }
    }
}