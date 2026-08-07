class Solution {
    public int removeDuplicates(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<arr.length){
            while(j<arr.length && arr[i]==arr[j]){
                j++;
            }
            int freq=j-i;
            if(freq==1) list.add(arr[i]);
            else if(freq==2) {
                list.add(arr[i]);
                list.add(arr[i]);
            }
            else {
                list.add(arr[i]);
                list.add(arr[i]);
            }
            i = j;
        }

        for(int a=0;a<list.size();a++){
            arr[a]=list.get(a);
        }
        return list.size();
    }
}