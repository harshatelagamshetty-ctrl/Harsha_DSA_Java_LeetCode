class Solution {
    public void sortColors(int[] arr) {
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            if(arr[i]==0 && arr[j]!=0){
                i++;
                j--;
            }
            else if(arr[i]==0 && arr[j]==0) i++;
            else if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            else if(arr[i]!=0 && arr[j]!=0){
                j--;
            }
        }
        int idx = 0;

        while (idx < arr.length && arr[idx] == 0) {
            idx++;
        }

        
        int a=idx;
        int b=arr.length-1;
        while(a<=b){
            if(arr[a]==1 && arr[b]!=1){
                a++;
                b--;
            }
            else if(arr[a]==1 && arr[b]==1) a++;
            else if(arr[a]!=1 && arr[b]==1){
                int temp=arr[a];
                arr[a]=arr[b];
                arr[b]=temp;
            }
            else if(arr[a]!=1 && arr[b]!=1){
                b--;
            }
        }
    }
}