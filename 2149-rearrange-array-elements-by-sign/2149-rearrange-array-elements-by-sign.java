class Solution {
    public int[] rearrangeArray(int[] arr) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        int [] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0) pos.add(arr[i]);
            else neg.add(arr[i]);
        }
        int i=0;
        int j=0;
        int k=0;

        while(i<pos.size() && j<neg.size()){
            res[k]=pos.get(i);
            k++;
            i++;
            res[k]=neg.get(j);
            k++;
            j++;
        }
        while(i<pos.size()){
            res[k]=pos.get(i);
            k++;
            i++;
        }
        while(j<neg.size()){
            res[k]=neg.get(j);
            k++;
            j++;
        }
        return res;
    }
}