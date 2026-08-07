class Solution {
    public int removeDuplicates(int[] arr) {
        int i=0;
        int j=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(j<arr.length){
            if(arr[i]==arr[j]) j++;
            else{
                int freq=j-i;
                if(freq>=1) list.add(arr[i]);
                i = j;
            }
        }
        int freq=j-i;
        if(freq>=1) list.add(arr[i]);

        for(int a=0;a<list.size();a++){
            arr[a]=list.get(a);
        }
        return list.size();
    }
}