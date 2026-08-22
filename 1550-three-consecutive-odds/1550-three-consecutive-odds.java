class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if(arr.length<3) return false;
        ArrayList<Integer>list=new ArrayList<>();
        int count=0;
        for(int i=0;i<3;i++){
            if(arr[i]%2!=0) count++;
        }
        list.add(count);
        for(int i=3;i<arr.length;i++){
            if(arr[i]%2!=0) count=count+1;
            if(arr[i-3]%2!=0) count=count-1;
            list.add(count);
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i)==3) return true;
        }
        return false;
        
    }
}