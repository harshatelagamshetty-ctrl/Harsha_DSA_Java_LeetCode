class Solution {
    public int[] resultArray(int[] arr) {
        ArrayList<Integer>l1=new ArrayList<>();
        ArrayList<Integer>l2=new ArrayList<>();
        l1.add(arr[0]);
        l2.add(arr[1]);
        for(int i=2;i<arr.length;i++){
            if(l1.get(l1.size()-1)>l2.get(l2.size()-1)) l1.add(arr[i]);
            else l2.add(arr[i]);
        }
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<l1.size();i++) l.add(l1.get(i));
        for(int i=0;i<l2.size();i++) l.add(l2.get(i));
        int[] res=new int[l1.size()+l2.size()];
        for(int i=0;i<res.length;i++){
            res[i]=l.get(i);
        }
        return res;
    }
}