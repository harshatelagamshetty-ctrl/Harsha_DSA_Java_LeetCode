class Solution {
    public void sortColors(int[] arr) {
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            if(arr[i]==0) i++;
            else if (arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            else j--;
        }
        int idx=0;
        for(int a=0;a<arr.length;a++){
            if(arr[a]!=0){
                idx=a;
                break;
            }
        }
        int a=idx;
        int b=arr.length-1;
        while(a<=b){
            if(arr[a]==1) a++;
            else if(arr[b]==1){
                int temp=arr[a];
                arr[a]=arr[b];
                arr[b]=temp;
                a++;
                b--;
            }
            else b--;
        }
        return;
    }
}