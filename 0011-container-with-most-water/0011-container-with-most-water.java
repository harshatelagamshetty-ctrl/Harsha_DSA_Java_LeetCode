class Solution {
    public int maxArea(int[] arr) {
        int i=0;
        int j=arr.length-1;
        ArrayList<Integer> list=new ArrayList<>();
        while(i<j){
            int h=Math.min(arr[i],arr[j]);
            int b=j-i;
            int area=h*b;
            list.add(area);
            if(arr[i]<arr[j]) i++;
            else j--;
        }
        return Collections.max(list);
    }
}