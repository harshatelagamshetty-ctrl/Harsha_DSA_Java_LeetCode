class Solution {
    public int maxPower(String s) {
        int i=0;
        int j=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
                int freq=j-i;
                list.add(freq);
                i = j;
            }
        }
        int freq=j-i;
        list.add(freq);
        i = j;

        return Collections.max(list);
    }
}