class Solution {
    public int longestConsecutive(int[] a) {
        if(a.length==0) return 0;
        int[] arr=sortAndRemoveDuplicates(a);
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        int j=0;
        while(j<arr.length-1){
            if(arr[j+1]-arr[j]==1) j++;
            else{
                list.add(j-i+1);
                i=j+1;
                j=i;
            }
        }
        list.add(j-i+1);
        i=j+1;
        j=i;
        return Collections.max(list);
    }
    public int[] sortAndRemoveDuplicates(int[] arr){
                Arrays.sort(arr);

        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                arr[++j] = arr[i];
            }
        }

        return Arrays.copyOf(arr, j + 1);
    }
}