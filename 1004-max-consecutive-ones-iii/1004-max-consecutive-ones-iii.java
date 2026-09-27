class Solution {
    public int longestOnes(int[] arr, int k) {
        ArrayList<Integer>list=new ArrayList<>();
        int i=0;
        int j=0;
        int count=0;
        while(j<arr.length){
            if(arr[j]==1){
                j++;
            }
            else if(arr[j]==0){
                if(count==k){
                    list.add(j-i);
                    while(arr[i]!=0){
                        i++;
                    }
                    i++;
                    count--;
                }
                else{
                    count++;
                    j++;
                }

            }
            // else{
            //     list.add(j-i);
            //     i = j;
            // }
        }
        list.add(j-i);
        i = j;
        return Collections.max(list);
    }
}